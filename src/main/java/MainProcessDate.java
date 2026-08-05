import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MainProcessDate {
    public static void main(String[] args) {
//        System.out.println( processDate("2024-03-15", 5, "add"));
//        System.out.println( processDate("2024-13-45", 5, "add"));
//        System.out.println( processDate("2024-03-15", 10, "subtract"));
        System.out.println( processDate("2024-03-15", 5, "invalid"));
        System.out.println( processDate("2024-03-28", 5, "add"));
        System.out.println( processDate("2024-12-29", 5, "add"));


    }

    public static String processDate(String dateStr, int days, String operation) {
        // Write your code here
        LocalDate date;
        LocalDate result;
        try {
            date = LocalDate.parse(dateStr);
        } catch (DateTimeParseException e) {
           return  "Invalid date format";
        }

        date = LocalDate.parse(dateStr);
            switch(operation){
                case "add" -> result = date.plusDays(days);
                case "subtract" -> result = date.minusDays(days);
                default -> {
                    return  "Invalid operation";
                }
            }

        String dayOfWeek = String.valueOf(result.getDayOfWeek());
        return "Original: " + date + ", New: " + result + ", Day of week: " + dayOfWeek;
    }
}
