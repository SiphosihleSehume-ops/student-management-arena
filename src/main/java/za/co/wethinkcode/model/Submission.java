package za.co.wethinkcode.model;

public class Submission {

    // TODO: declare private fields:
    private int submission;
    private int studentId;
    private int assignment;
    private int marksAwarded;
    private Student student;
    private String assignmentTitle;
    private boolean processed;
    // submissionId (int)
    // studentId (int)
    // assignmentId (int)
    // marksAwarded (int)

    // TODO: implement constructor:

    public Submission(int submission, int studentId, int assignment, int marksAwarded) {
        if (marksAwarded < 0 || marksAwarded > 100) throw new IllegalArgumentException();
        this.submission = submission;
        this.studentId = studentId;
        this.assignment = assignment;
//        this.marksAwarded = marksAwarded;
        updateMarks(marksAwarded);
        this.processed = false;

    }

    public Submission(int submissions, Student student, String assignment) {
        this.submission = submissions;
        this.student = student;
        this.assignmentTitle = assignment;
        this.processed = false;
    }

    public Student getStudent() {
        return student;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void markProcessed() {
        processed = true;
    }


    // Submission(int submissionId, int studentId, int assignmentId, int marksAwarded)
    //
    // Rules:
    // - marksAwarded cannot be negative
    // - marksAwarded cannot exceed 100

    // TODO: implement getters:

    public int getSubmissionId() {
        return submission;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAssignmentId() {
        return assignment;
    }

    public int getMarksAwarded() {
        return marksAwarded;
    }

    // int getSubmissionId()
    // int getStudentId()
    // int getAssignmentId()
    // int getMarksAwarded()

    // TODO: implement updateMarks(int newMarks)
    public void updateMarks(int newMarks) {
        if (newMarks < 0 || newMarks > 100) throw new IllegalArgumentException();
        this.marksAwarded = newMarks;
    }
    //
    // Rules:
    // - throw IllegalArgumentException if newMarks < 0
    // - throw IllegalArgumentException if newMarks > 100
    // - otherwise update marksAwarded

    // TODO: override toString()

    @Override
    public String toString() {
        return "Submission{" +
                "submission=" + submission +
                ", studentId=" + studentId +
                ", assignment=" + assignment +
                ", marksAwarded=" + marksAwarded +
                ", student=" + student +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", processed=" + processed +
                '}';
    }


    // Example:
    // Submission 1 | Student 10 | Assignment 5 | Marks: 85
}