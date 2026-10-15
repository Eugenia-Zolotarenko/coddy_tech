package e.learning.platform;

// Class representing an instructor, extends User

public class Instructor extends User {
    // TODO: Add private field for specialty (String)
    private String specialty;

    // TODO: Create constructor that takes id, name, and specialty
    public Instructor(String id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }

    // TODO: Implement getRole() to return "Instructor"
    @Override
    String getRole() {
        return "Instructor";
    }

    // TODO: Add getter for specialty
    public String getSpecialty() {
        return specialty;
    }

    // TODO: Override toString() to return "Instructor: [name] - [specialty]"
    @Override
    public String toString() {
        return "Instructor: " + getName() + " - " + specialty;
    }
}
