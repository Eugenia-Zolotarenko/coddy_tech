package TicketsBookingSystem;

// TODO: Create a custom unchecked exception that extends RuntimeException
// This exception is thrown when an invalid seat number is requested

class InvalidSeatException extends RuntimeException {
    // TODO: Create a constructor that accepts a message
    // and passes it to the parent class using super(message)
    public  InvalidSeatException(String message){
        super(message);
    }
}