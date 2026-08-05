package UserRegistrationsSystem;

// ValidationException.java
// Base checked exception for all validation errors

// TODO: Create a checked exception class called ValidationException
// - It should extend Exception
// - Include a constructor that accepts a String message
// - Pass the message to the parent constructor

class ValidationException extends Exception {
    // TODO: Implement the constructor
    public ValidationException(String message) {
        super(message);
    }
}