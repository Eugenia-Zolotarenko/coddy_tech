package library.managment.system;

class User {
    // TODO: Declare private fields
    // - id (String)
    // - name (String)
    private String id,
                   name;

    // TODO: Create a constructor that accepts id and name

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // TODO: Create getter methods
    // - getId()
    // - getName()

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TODO: Override toString() method
    // Should return: "User[id]: name"

    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
