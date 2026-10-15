package e.learning.platform;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        String input = "ADD_INSTRUCTOR:I001:Dr. Smith:Java,ADD_STUDENT:S001:Alice,ADD_COURSE:C001:OOP Basics:I001,ENROLL:S001:C001,INFO:S001";
        input = "ADD_INSTRUCTOR:I001:Dr. Smith:Java,ADD_STUDENT:S001:Alice,ADD_STUDENT:S002:Bob,ADD_COURSE:C001:OOP Fundamentals:I001,ENROLL:S001:C001,ENROLL:S002:C001,INFO:S001,INFO:I001";
        input = "ADD_INSTRUCTOR:I001:Prof. Johnson:Python,ADD_STUDENT:S001:Charlie,INFO:I001,INFO:S001";
        input = "ADD_INSTRUCTOR:I001:Dr. Lee:Databases,ADD_COURSE:C001:SQL Mastery:I001,ADD_STUDENT:S001:Diana,ADD_STUDENT:S002:Eve,ADD_STUDENT:S003:Frank,ENROLL:S001:C001,ENROLL:S002:C001,ENROLL:S003:C001,INFO:S001";
        input = "ADD_INSTRUCTOR:I001:Dr. Brown:Web Dev,ADD_INSTRUCTOR:I002:Prof. White:Data Science,ADD_COURSE:C001:HTML Basics:I001,ADD_COURSE:C002:Machine Learning:I002,ADD_STUDENT:S001:Grace,ENROLL:S001:C001,ENROLL:S001:C002,INFO:S001";
        // TODO: Create collections to store instructors, students, and courses
        // Hint: Use HashMap with id as key for easy lookup
        HashMap<String, User> instructors = new HashMap<>();
        HashMap<String, Student> students = new HashMap<>();
        TreeMap<String, Course> courses = new TreeMap<>();

        // TODO: Split input by comma to get individual commands
        String[] commandLines = input.split(",");


        // TODO: Process each command:
        // - ADD_INSTRUCTOR:id:name:specialty -> Create instructor, add to collection, print "Instructor added: [name]"
        // - ADD_STUDENT:id:name -> Create student, add to collection, print "Student added: [name]"
        // - ADD_COURSE:courseId:title:instructorId -> Create course with instructor, add to collection, print "Course added: [title]"
        // - ENROLL:studentId:courseI           d -> Enroll student in course, print "[studentName] enrolled in [courseTitle]"
        // - INFO:userId -> Find user (student or instructor) and print their toString()
        for (String line: commandLines){
            String[] commands = line.split(":");

            switch (commands[0]){
                case "ADD_INSTRUCTOR" -> {
                    User instructor = new Instructor(commands[1], commands[2], commands[3]);
                    instructors.put(instructor.getId(), instructor);
                    System.out.println("Instructor added: " + instructor.getName());
                }
                case "ADD_STUDENT" -> {
                    Student student  = new Student(commands[1], commands[2]);
                    students.put(student.getId(), student);
                    System.out.println("Student added: " + student.getName());
                }
                case "ADD_COURSE" -> {
                    User instructor = instructors.get(commands[3]);
                    Course course = new Course(commands[1], commands[2], instructor);
                    courses.put(course.getCourseId(), course);
                    System.out.println("Course added: " + course.getTitle());
                }
                case "ENROLL" -> {
                    Course course = courses.get(commands[2]);
                    Student student = students.get(commands[1]);
                    course.enroll(student);
                    System.out.println(student.getName() + " enrolled in " + course.getTitle());
                }
                case "INFO" -> {
                    User user = (students.get(commands[1])!=null)? students.get(commands[1]): instructors.get(commands[1]);
                    System.out.println(user.toString());
                }
                default -> System.out.println("Invalid command");
            }
        }

        // TODO: After processing all commands, print "--- Platform Summary ---"
        System.out.println("--- Platform Summary ---");

        // TODO: For each course, print "[courseDetails] - [count] student(s)"
        for (String courseId: courses.keySet()){
            Course course = courses.get(courseId);
            System.out.println(course.getDetails() +" - " + course.getEnrolledCount() + " student(s)");
        }
    }
}
