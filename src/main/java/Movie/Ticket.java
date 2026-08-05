package Movie;

// TODO: Create a record named Ticket with three components:
// - movie (Movie)
// - seatNumber (String)
// - price (double)

// TODO: Add a compact constructor that validates the price
// If price <= 0, throw IllegalArgumentException with message "Price must be positive"

// TODO: Add a custom method printTicket() that returns a multi-line string:
// ========== TICKET ==========
// Movie: [movie title]
// Genre: [movie genre]
// Duration: [formatted duration from movie]
// Seat: [seatNumber]
// Price: $[price]
// ============================

record Ticket(Movie movie, String seatNumber, double price) {

    // TODO: Add compact constructor with price validation
    public Ticket{
        if (price < 0) throw new IllegalArgumentException("Age cannot be negative");
    }
    // TODO: Implement printTicket() method
    public String printTicket(){
        return "========== TICKET ==========\n" +
               "Movie: " + movie.title() + "\n" +
               "Genre: " + movie.genre() + "\n" +
               "Duration: " + movie.getFormattedDuration() + "\n" +
               "Seat: "  + seatNumber + "\n" +
               "Price: $" + price + "\n" +
                "============================";
    }
}
