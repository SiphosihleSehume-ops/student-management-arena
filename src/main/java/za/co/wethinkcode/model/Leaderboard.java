package za.co.wethinkcode.model;

import java.util.*;

public class Leaderboard {

    // TODO: declare private fields:
    private List<Student> rankings;
    private HashMap<Integer, Student> studentLookUp;
    // rankings (List<Student>)
    // studentLookup (HashMap<Integer, Student>)

    // TODO: implement constructor:

    public Leaderboard() {
        this.rankings = new ArrayList<>();
        this.studentLookUp = new HashMap<>();
    }

    // Leaderboard()
    //
    // - initialise rankings as new ArrayList<>()
    // - initialise studentLookup as new HashMap<>()

    // TODO: implement addStudent(Student student)
    public void addStudent(Student student) {
        rankings.add(student);
        studentLookUp.put(student.getId(), student);
        updateRankings();
    }
    // - add student to rankings
    // - add student to studentLookup
    // - call updateRankings()

    // TODO: implement getStudentById(int studentId)
    public Student getStudentById(int studentId) {
        for (Map.Entry<Integer, Student> entry : studentLookUp.entrySet()) {
            int id = entry.getKey();
            if ( id == studentId) return entry.getValue();
        }
        return null;
    }
    // - return student from HashMap
    // - return null if not found

    // TODO: implement getTopStudent()
    public Student getTopStudent() {
        if (!rankings.isEmpty()) {
            return rankings.get(0);
        }
        return null;

    }
    // - return first student in rankings
    // - return null if rankings empty

    // TODO: implement getRankings()
    public List<Student> getRankings() {
        return new ArrayList<>(rankings);
    }
    // - return defensive copy

    // TODO: implement updateRankings()
    public void updateRankings() {
        Comparator<Student> gpaComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Comparing studentB to studentA ensures highest GPA comes first
                return Double.compare(o2.getGpa(), o1.getGpa());
            }
        };

        // Then, sort the ranks
        rankings.sort(gpaComparator);
    }
    //
    // Ranking Rules:
    // - highest GPA first
    // - if GPA ties, preserve insertion order
    //
    // Hint:
    // - use Comparator

    // TODO: implement totalStudents()
    public int totalStudents() {
        return studentLookUp.size();
    }

    // TODO: override toString()

    @Override
    public String toString() {
        return "Leaderboard{" +
                "rankings=" + rankings +
                ", studentLookUp=" + studentLookUp +
                '}';
    }

    // Example:
    // Leaderboard:
    // 1. John - GPA 3.9
    // 2. Sarah - GPA 3.7
}