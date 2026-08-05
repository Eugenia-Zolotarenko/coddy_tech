package Movie;// TODO: Create a record named Movie with three components:
// - title (String)
// - genre (String)
// - durationMinutes (int)

// TODO: Add a custom method getFormattedDuration() that returns
// the duration in format: "[hours]h [minutes]m"
// Example: 142 minutes becomes "2h 22m"
// Hint: Use integer division (/) for hours and modulo (%) for remaining minutes

record Movie(String title, String genre, int durationMinutes) {
    public String getFormattedDuration(){
        int hours = (int) durationMinutes/60;
        int min = durationMinutes%60;
        return hours + "h " + min + "m";
    }

    // TODO: Implement getFormattedDuration() method

}
