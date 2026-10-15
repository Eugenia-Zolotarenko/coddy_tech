package e.learning.platform;

import java.util.ArrayList;

// Class representing a course, implements Enrollable

public class Course implements Enrollable, Comparable<Course> {
    // TODO: Add private fields for courseId, title, instructor, and ArrayList of enrolled Students
    private String courseId, title;
    private User instructor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    // TODO: Create constructor that takes courseId, title, and instructor
    public Course(String courseId, String title, User instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    // TODO: Implement enroll(Student student) - add student to list, call student's addCourse(), return true
    @Override
    public boolean enroll(Student student) {
        enrolledStudents.add(student);
        student.addCourse(courseId);
        return true;
    }

    // TODO: Implement getEnrolledCount() to return number of enrolled students
    @Override
    public int getEnrolledCount() {
        return enrolledStudents.size();
    }

    // TODO: Add method getDetails() that returns "[courseId] [title] by [instructorName]"
    public String  getDetails(){
        return "[" + courseId + "] " + title + " by " + instructor.getName();
    }

    // TODO: Add getters as needed (getCourseId, getTitle, etc.)
    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public User getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public int compareTo(Course other) {
       return this.title.compareTo(other.title);
    }
}

