package e.learning.platform;
// Abstract base class representing any user on the platform

public abstract class User {
    // TODO: Add private fields for id (String) and name (String)
    private String id;
    private String name;

    // TODO: Create constructor that initializes both fields
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // TODO: Add appropriate getters for id and name
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TODO: Declare abstract method getRole() that returns a String
    abstract String getRole();
}
