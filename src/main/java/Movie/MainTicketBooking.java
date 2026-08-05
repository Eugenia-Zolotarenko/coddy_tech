package Movie;

public class MainTicketBooking {
    public static void main(String[] args) {
        // Read inputs
        String title = "Inception";
        String genre = "Sci-Fi";
        int durationMinutes = 148;
        String seatNumber = "A1";
        double price = 12.50;

        // TODO: Create a Movie record with title, genre, and durationMinutes
        Movie movie = new Movie(title, genre, durationMinutes);

        // TODO: Create a Ticket record with the movie, seatNumber, and price
        Ticket ticket = new Ticket(movie, seatNumber,price);

        // TODO: Print the ticket using printTicket() method
        System.out.println(ticket.printTicket());
    }
}
