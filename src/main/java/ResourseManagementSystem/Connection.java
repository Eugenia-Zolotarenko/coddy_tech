package ResourseManagementSystem;

// TODO: Create a Connection class that implements AutoCloseable
//
// Required:
// - Private field for connection name (String)
// - Constructor that takes the name and prints "[name] connection opened"
// - query(String sql) method that prints "Executing on [name]: [sql]"
// - close() method that prints "[name] connection closed"

class Connection implements AutoCloseable {
    // TODO: Add private field for connection name
    private String connectionName;

    // TODO: Create constructor

    public Connection(String connectionName) {
        this.connectionName = connectionName;
        System.out.println( this.connectionName + " connection opened");
    }

    // TODO: Implement query method
    public void query(String sql){
        System.out.println("Executing on " + this.connectionName +": " +sql);
    }

    // TODO: Implement close method
    @Override
    public void close() {
        // TODO: Print closing message
        System.out.println(this.connectionName + " connection closed");
    }
}