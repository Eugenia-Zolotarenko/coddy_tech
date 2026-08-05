package TicketsBookingSystem;

// TODO: Create a class that manages ticket sales

class TicketBooth {
    // TODO: Add fields to track available seats and total seats
    int totalSeats;
    int availableSeats;

    // TODO: Create a constructor that takes the total number of seats

    public TicketBooth(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = this.totalSeats;
    }



    // TODO: Create a bookTicket(int seatNumber) method that:
    // - Throws TicketSoldOutException with "No tickets remaining" if no seats available
    // - Throws InvalidSeatException with "Seat [seatNumber] does not exist" if seat is invalid
    // - Otherwise decreases available seats and prints "Booked seat [seatNumber] successfully"
    // Note: This method must declare that it throws TicketSoldOutException
    public void bookTicket(int seatNumber) throws TicketSoldOutException{
        if (availableSeats <= 0)
            throw new TicketSoldOutException("No tickets remaining");
        if (seatNumber > totalSeats || seatNumber <=0)
            throw new InvalidSeatException("Seat " + seatNumber +" does not exist");

        availableSeats--;
        System.out.println("Booked seat " + seatNumber +" successfully");
    }

    // TODO: Create a getAvailableSeats() method that returns available seats count
    public int getAvailableSeats(){
        return this.availableSeats;
    }
}