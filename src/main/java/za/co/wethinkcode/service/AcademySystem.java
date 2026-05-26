package za.co.wethinkcode.service;

import com.sun.source.tree.ClassTree;
import za.co.wethinkcode.model.Classroom;
import za.co.wethinkcode.model.Student;

import java.util.*;

public abstract class AcademySystem {

    // TODO: declare private fields:
    private String academyName;
    private List<Student> students;
    private Queue<Student> registrationQueue;
    private HashMap<Student, Classroom> classroomMappings;
    private HashMap<Classroom, Student> reverseMappings;
    // academyName (String)
    // students (List<Student>)
    // registrationQueue (Queue<Student>)
    // classroomMappings (HashMap<Student, Classroom>)
    // reverseMappings (HashMap<Classroom, Student>)

    // TODO: implement constructor:

    public AcademySystem(String academyName) {
        this.academyName = academyName;
        this.students = new ArrayList<>();
        this.registrationQueue = new LinkedList<>();
        this.classroomMappings = new HashMap<>();
        this.reverseMappings = new HashMap<>();
    }

    // AcademySystem(String academyName)
    //
    // - initialise students as new ArrayList<>()
    // - initialise registrationQueue as new LinkedList<>()
    // - initialise classroomMappings as new HashMap<>()
    // - initialise reverseMappings as new HashMap<>()

    // =========================
    // STUDENT MANAGEMENT
    // =========================

    // TODO: implement addStudent(Student student)
    public void addStudent(Student student) {
        students.add(student);
    }
    // - add student to list

    // TODO: implement removeStudentById(int studentId)
    public boolean removeStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
    // - remove matching student
    // - return true if removed
    // - otherwise false

    // TODO: implement getStudentById(int studentId)
    public Student getStudentById(int studentId) {
        Student foundStudent = null;

        for (Student student : students) {
            if (student.getId() == studentId) {
                foundStudent = student;
                return foundStudent;
            }
        }
        return null;
    }
    // - return matching student
    // - otherwise return null

    // TODO: implement getAllStudents()
    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }
    // - return unmodifiable list

    // =========================
    // REGISTRATION QUEUE
    // =========================

    // TODO: implement enqueueRegistration(Student student)
    public void enqueueRegistration(Student student) {
        registrationQueue.offer(student);
    }
    // - add student to queue

    // TODO: implement processNextRegistration()
    public Student processNextRegistration() {
        Student first = registrationQueue.poll();

        if (first == null) return null;
        registrationQueue.remove(first);
        return first;
    }
    // - process next student in queue
    // - remove from queue
    // - return processed student
    // - return null if queue empty

    // =========================
    // CLASSROOM MAPPINGS
    // =========================

    // TODO: implement assignClassroom(Student student, Classroom classroom)
    public void assignClassroom(Student student, Classroom classroom) {
        classroomMappings.put(student, classroom);
        reverseMappings.put(classroom, student);
    }
    // Rules:
    // - add mapping student -> classroom
    // - add reverse mapping classroom -> student

    // TODO: implement getClassroom(Student student)
    public Classroom getClassroom(Student student) {
        return  classroomMappings.get(student);
    }
    // - return mapped classroom

    // TODO: implement getStudent(Classroom classroom)
    public Student getStudent(Classroom classroom) {
        return reverseMappings.get(classroom);
    }
    // - return mapped student

    // TODO: implement academyName()
    public String academyName() {
        return academyName;
    }
    // - return academy name

    // =========================
    // ABSTRACT BEHAVIOUR
    // =========================

    // Each subclass defines registration processing behaviour
    protected abstract void processRegistration(Student student);
}