package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

    // TODO: declare private fields:
    private int assignmentId;
    private String title;
    private int totalMarks;
    private List<Submission> submissions;

    // TODO: implement constructor:
    public Assignment(int assignmentId, String title, int totalMarks) {
        if (totalMarks < 0) throw new IllegalArgumentException("Marks cannot be negative");
        if (totalMarks > 100) throw new IllegalArgumentException("Marks cannot exceed 100");

        this.totalMarks = totalMarks;
        this.assignmentId = assignmentId;
        this.title = title;
        this.submissions = new ArrayList<>();

    }
    // TODO: implement getters:

    public int getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    // TODO: implement addSubmission(Submission submission)
    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }
    // TODO: implement getSubmissions()
    public List<Submission> getSubmissions() {
        return new ArrayList<>(submissions);
    }
    // TODO: implement getSubmissionCount()
    public int getSubmissionCount() {
        return submissions.size();
    }
    // TODO: override toString()

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", title='" + title + '\'' +
                ", totalMarks=" + totalMarks +
                ", submissions=" + submissions +
                '}';
    }
}