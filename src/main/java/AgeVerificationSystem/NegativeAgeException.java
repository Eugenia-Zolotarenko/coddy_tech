package AgeVerificationSystem;

// NegativeAgeException.java
// This is an UNCHECKED exception - extends RuntimeException
// Callers are NOT forced to handle this exception

class NegativeAgeException extends RuntimeException {
    // TODO: Create a constructor that accepts a message
    // and passes it to the parent class using super()

    public NegativeAgeException(String message) {
        super(message);
    }
}
