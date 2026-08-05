package UserRegistrationsSystem;

// InvalidUsernameException.java
// Checked exception for username validation failures

// TODO: Create a checked exception class called InvalidUsernameException
// - It should extend ValidationException (creating an exception hierarchy)
// - Include a constructor that accepts a String message
// - Pass the message to the parent constructor

class InvalidUsernameException extends ValidationException {
    // TODO: Implement the
    public InvalidUsernameException(String message) {
        super(message);
    }
}
