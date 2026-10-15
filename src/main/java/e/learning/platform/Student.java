package e.learning.platform;

import java.util.ArrayList;

// Class representing a student, extends User

public class Student extends User {
    // TODO: Add private ArrayList to track enrolled course IDs
        private ArrayList<String> enrolledCourseId;

    // TODO: Create constructor that calls parent constructor and initializes the ArrayList
    public Student(String id, String name) {
        super(id, name);
        enrolledCourseId = new ArrayList<>();
    }

    // TODO: Implement getRole() to return "Student"
    @Override
    String getRole() {
        return "Student";
    }

    // TODO: Add method addCourse(String courseId) to add course to the list
    public void addCourse(String courseId){
        enrolledCourseId.add(courseId);
    }

    // TODO: Add method getEnrolledCourseCount() to return number of enrolled courses
    public int getEnrolledCourseCount(){
        return enrolledCourseId.size();
    }

    // TODO: Override toString() to return "Student: [name] ([enrolledCount] courses)"
    @Override
    public String toString() {
        return "Student: " + getName() + " (" +
                getEnrolledCourseCount() + " courses)";
    }
}
