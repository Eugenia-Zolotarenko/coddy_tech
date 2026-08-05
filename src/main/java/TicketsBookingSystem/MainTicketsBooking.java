package TicketsBookingSystem;



public class MainTicketsBooking {
    public static void main(String[] args) throws TicketSoldOutException {

        int totalSeats = 3;
        int seatNumber = 3;

        // TODO: Create a TicketBooth with the given total seats
        TicketBooth ticketBooth = new TicketBooth(totalSeats);

        // TODO: Use a try-catch block to attempt booking the seat
        // - Catch TicketSoldOutException first and print "Booking failed: [exception message]"
        // - Catch InvalidSeatException and print "Booking failed: [exception message]"
        try{
            ticketBooth.bookTicket(seatNumber);
        } catch (TicketSoldOutException | InvalidSeatException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }

        // TODO: After the try-catch, print "Remaining seats: [count]"
        System.out.println("Remaining seats: " + ticketBooth.getAvailableSeats());
    }
}
