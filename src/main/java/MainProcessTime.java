import java.time.DateTimeException;
import java.time.LocalTime;

public class MainProcessTime {
    public static void main(String[] args) {
        System.out.println( processTime( "14:30",2,  "hours", "add"));
        System.out.println( processTime( "14:30",45,  "minutes", "subtract"));
        System.out.println( processTime( "25:70",2,  "hours", "add"));
        System.out.println( processTime( "14:30",2,  "seconds", "add"));
        System.out.println( processTime( "23:30",1,  "hours", "add"));
        System.out.println( processTime( "00:30",45,  "minutes", "subtract"));

    }
    public static String processTime(String timeStr, int amount, String unit, String operation) {
        // Write your code here
        LocalTime time;
        LocalTime result;
        try {
            time = LocalTime.parse(timeStr);
        } catch (DateTimeException e){
            return "Invalid time format";
        }

        time = LocalTime.parse(timeStr);

        switch (operation){
            case "add"-> {
                switch (unit) {
                    case "hours" -> result = time.plusHours(amount);
                    case "minutes" -> result = time.plusMinutes(amount);
                    default -> {
                        return "Invalid unit";
                    }
                }
            }
            case "subtract" ->{
                switch (unit){
                    case "hours"-> result = time.minusHours(amount);
                    case "minutes" -> result = time.minusMinutes(amount);
                    default -> {
                     return "Invalid unit";
                     }
                }

            }
            default -> {
                return "Invalid operation";
            }
        }

        return  "Original: " +time + ", New: " + result;

    }

}
