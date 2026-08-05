package UserRegistrationsSystem;

// InvalidAgeException.java
// Unchecked exception for age-related programming errors

// TODO: Create an unchecked exception class called InvalidAgeException
// - It should extend RuntimeException
// - Include a constructor that accepts a String message
// - Pass the message to the parent constructor

class InvalidAgeException extends RuntimeException {
    // TODO: Implement the constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}