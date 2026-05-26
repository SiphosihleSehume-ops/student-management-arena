package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    // TODO: declare private fields:
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    // TODO: implement constructor:

    public Course(String courseCode, String courseName, int maxCapacity) {
        if (maxCapacity <= 0) throw new IllegalArgumentException("Max must be greater than zero");

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // TODO: implement getters:

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }



    // TODO: implement enrolStudent(Student student)
    public boolean enrolStudent(Student student) {
        if (maxCapacity == enrolledStudents.size()) return false;
        if (enrolledStudents.contains(student)) return false;
        enrolledStudents.add(student);
        return true;
    }
    // - return false if course is full
    // - return false if student already enrolled
    // - otherwise add student and return true
    // TODO: implement removeStudentById(int studentId)
    public boolean removeStudentById(int studentId) {
        for (Student student : enrolledStudents) {
            if (student.getId() == studentId) enrolledStudents.remove(student);
            return true;
        }
        return false;
    }
    // - remove matching student
    // - return true if removed
    // - otherwise false

    // TODO: implement getEnrolledStudents()
    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    // TODO: implement getTotalStudents()
    public int getTotalStudents() {
        return enrolledStudents.size();
    }

    // TODO: implement hasStudent(String studentName)
    public boolean hasStudent(String studentName) {
        for (Student student : enrolledStudents) {
            if (student.getName() == studentName) return true;
        }
        return false;
    }

    // TODO: override toString()

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    // Example:
    // Course: CSC101 - Introduction to Programming
}