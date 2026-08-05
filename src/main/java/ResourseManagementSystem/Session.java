package ResourseManagementSystem;

// TODO: Create a Session class that implements AutoCloseable
//
// Required:
// - Private field for username (String)
// - Constructor that takes the username and prints "Session started for [username]"
// - performAction(String action) method that prints "[username] performed: [action]"
// - close() method that prints "Session ended for [username]"

class Session implements AutoCloseable {
    // TODO: Add private field for username
    private String username;

    // TODO: Create constructor

    public Session(String username) {
        this.username = username;
        System.out.println("Session started for " + this.username);
    }

    // TODO: Implement performAction method
    public void performAction(String action){
        System.out.println(this.username + " performed: " + action);
    }

    // TODO: Implement close method
    @Override
    public void close() {
        // TODO: Print closing message
        System.out.println("Session ended for " + this.username);
    }
}
