package TicketsBookingSystem;

// TODO: Create a custom checked exception that extends Exception
// This exception is thrown when tickets are no longer available

class TicketSoldOutException extends Exception {
    // TODO: Create a constructor that accepts a message
    // and passes it to the parent class using super(message)
    public TicketSoldOutException(String  message){
        super(message);
    }
}
