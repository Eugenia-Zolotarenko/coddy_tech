package AgeVerificationSystem;

// InvalidAgeException.java
// This is a CHECKED exception - extends Exception directly
// Callers will be FORCED to handle this exception

class InvalidAgeException extends Exception {
    // TODO: Create a constructor that accepts a message
    // and passes it to the parent class using super()

    public InvalidAgeException(String message) {
        super(message);
    }
}