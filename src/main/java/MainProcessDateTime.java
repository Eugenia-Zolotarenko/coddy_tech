import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MainProcessDateTime {
    public static void main(String[] args) {
        System.out.println(processDateTime("2024-03-15 14:30", 2, "hours", "add"));
        System.out.println(processDateTime("2024-03-15 14:30", 2, "days", "subtract"));
        System.out.println(processDateTime("2024-03-15 14:30", 2, "minutes", "add"));
        System.out.println(processDateTime("2024-13-45 25:70", 2, "hours", "add"));
        System.out.println(processDateTime("2024-12-15 14:30", 2, "months", "add"));
        System.out.println(processDateTime("2024-03-15 23:30", 2, "hours", "add"));

    }
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
        // Write your code here
        LocalDateTime dateTime;
        LocalDateTime processed;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String originalFormated, resultDay, processedFormatted;

        try {
            dateTime = LocalDateTime.parse(dateTimeStr, formatter);//LocalDateTime.parse(dateTimeStr);

        } catch (DateTimeParseException e) {
            return "Invalid date time format";
        }

        switch (operation){
            case "add"->{
                switch (unit){
                    case "hours" -> processed = dateTime.plusHours(amount);
                    case "days"  -> processed = dateTime.plusDays(amount);
                    case "months"-> processed =dateTime.plusMonths(amount);
                    default -> {
                        return "Invalid unit";
                    }
                }
            }
            case "subtract"->{
                switch (unit){
                    case "hours"  -> processed = dateTime.minusHours(amount);
                    case "days"   -> processed = dateTime.minusDays(amount);
                    case "months" -> processed = dateTime.minusMonths(amount);
                    default -> {
                        return "Invalid unit";
                    }
                }
            }
            default -> {
                return "Invalid operation";
            }
        }
        originalFormated = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        processedFormatted = processed.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        resultDay = String.valueOf(processed.getDayOfWeek());
        return "Original: " + originalFormated + ", New: " + processedFormatted + ", Day: " + resultDay;


    }
}
