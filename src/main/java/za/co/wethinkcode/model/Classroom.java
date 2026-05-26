package za.co.wethinkcode.model;

public class Classroom {

    // TODO: declare private fields:
    private String roomNumber;
    private Course assignedCourse;
    private int seatingCapacity;

    // TODO: implement constructor:
    public Classroom(String roomNumber, int seatingCapacity) {
        if (seatingCapacity <= 0) throw new IllegalArgumentException("Seating capacity must be greater than zero");

        this.roomNumber = roomNumber;
        this.seatingCapacity = seatingCapacity;
    }
    // TODO: implement getters:
    public String getRoomNumber() {
        return roomNumber;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    // TODO: implement assignCourse(Course course)
    public void assignCourse(Course course) {
        this.assignedCourse = course;
    }
    // - assign course to classroom

    // TODO: override toString()

    @Override
    public String toString() {
        return "Classroom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", assignedCourse=" + assignedCourse +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }

    // Example:
    // Classroom A12 (Capacity: 40)
}