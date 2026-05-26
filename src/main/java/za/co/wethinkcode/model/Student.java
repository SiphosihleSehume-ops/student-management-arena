package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // TODO: declare private fields:
    private int id;
    private String name;
    private int level;
    private double gpa;
    private List<Course> registeredCourse;
    private List<Assignment> completedAssignments;
    // id (int)
    // name (String)
    // level (int)
    // gpa (double)
    // registeredCourses (List<Course>)
    // completedAssignments (List<Assignment>)

    // TODO: implement constructor:

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.gpa = 0.0;
        this.registeredCourse = new ArrayList<>();
        this.completedAssignments = new ArrayList<>();
    }

    // Student(int id, String name)
    //
    // Initial values:
    // - level = 1
    // - gpa = 0.0
    // - registeredCourses = new ArrayList<>()
    // - completedAssignments = new ArrayList<>()

    // TODO: implement getters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getGpa() {
        return gpa;
    }

    // int getId()
    // String getName()
    // int getLevel()
    // double getGpa()

    // TODO: implement registerCourse(Course course)
    public void registerCourse(Course course) {
        if (!registeredCourse.contains(course)) registeredCourse.add(course);

    }
    // - add course if not already registered

    // TODO: implement completeAssignment(Assignment assignment)
    public void completeAssignment(Assignment assignment) {
        completedAssignments.add(assignment);
    }
    // - add assignment to completedAssignments

    // TODO: implement updateGpa(double newGpa)
    public void updateGpa(double newGpa) {
        if (newGpa < 0 || newGpa > 4.0) throw new IllegalArgumentException();
        this.gpa = newGpa;
    }
    // Rules:
    // - throw IllegalArgumentException if newGpa < 0
    // - throw IllegalArgumentException if newGpa > 4.0
    // - otherwise update GPA

    // TODO: implement levelUp()
    public void levelUp() {
        level++;
    }
    // - increase level by 1

    // TODO: implement getRegisteredCourses()
    public List<Course> getRegisteredCourses() {
        return new ArrayList<>(registeredCourse);
    }
    // - return defensive copy

    // TODO: implement getCompletedAssignments()
    public List<Assignment> getCompletedAssignments() {
        return new ArrayList<>(completedAssignments);
    }
    // - return defensive copy

    // TODO: override toString()

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", gpa=" + gpa +
                ", registeredCourse=" + registeredCourse +
                ", completedAssignments=" + completedAssignments +
                '}';
    }

    // Example:
    // Student: John (Level 2, GPA 3.5)
}



