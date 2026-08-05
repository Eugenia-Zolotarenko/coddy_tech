package ResourseManagementSystem;

public class MainResourceManagement {
    public static void main(String[] args) {

        String connectionName = "DB";
        String username = "Alice";
        String action = "login";

        // === Single Resource ===
        // TODO: Print the header
        // TODO: Use try-with-resources to create a Connection
        // TODO: Inside the try block, call query("SELECT * FROM users")
        System.out.println("=== Single Resource ===");
        try(Connection connection = new Connection(connectionName)){
            connection.query("SELECT * FROM users");
        }

        // === Multiple Resources ===
        // TODO: Print a blank line and the header
        // TODO: Use try-with-resources with both Connection and Session
        // TODO: Inside the try block:
        //       - Call query("INSERT INTO logs") on the connection
        //       - Call performAction with the input action on the session
            System.out.println();
            System.out.println("=== Multiple Resources ===");
            try(Connection connection = new Connection(connectionName);
                Session session = new Session(username)){
                connection.query("INSERT INTO logs");
                session.performAction(action);
            }
    }
}
