import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class MainCalculateDifference {
    public static void main(String[] args) {
        System.out.println(calculateDifference("2024-01-15 10:30", "2025-03-20 14:45",
                "period", "full"));
        System.out.println(calculateDifference("2024-01-15 10:30", "2025-03-20 14:45","period", "simple"));
        System.out.println(calculateDifference("2024-03-15 10:30", "2024-03-15 14:45","duration", "simple"));
        System.out.println(calculateDifference("2024-13-45 10:30", "2024-03-15 14:45","duration", "simple"));
        System.out.println(calculateDifference("2024-13-45 10:30", "2024-03-15 14:45","duration", "simple"));
        System.out.println(calculateDifference("2024-03-15 10:30", "2024-03-15 14:45","duration", "full"));
        System.out.println(calculateDifference("2024-03-15 10:30", "2024-03-15 14:45","un", "full"));

    }
    public static String calculateDifference(String start, String end, String unit, String format) {
        // Write your code here
        LocalDate startDay, endDay;
        LocalDateTime startDayTime, endDayTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        Period period;
        Duration duration;
        String years, month, days, hours, minutes;


        try {
            startDay = LocalDate.parse(start,formatter);
            endDay = LocalDate.parse(end,formatter);
            startDayTime = LocalDateTime.parse(start, formatter);
            endDayTime = LocalDateTime.parse(end,formatter);

        } catch (DateTimeParseException e){
            return  "Invalid date format";
        }

        switch (unit){
            case "period" -> {
                 period = Period.between(startDay, endDay);
                 years = String.valueOf(period.getYears());
                 month = String.valueOf(period.getMonths());
                 days = String.valueOf(period.getDays());
                 switch (format){
                     case "full" -> {return "Years: " + years + ", Months: " + month+", Days: " + days;}
                     case "simple" -> {return years + "y" + month +"m" + days+"d";}
                     default -> {return "Invalid format";
                     }
                 }
            }
           case "duration" -> {
                duration = Duration.between(startDayTime, endDayTime);
                hours = String.valueOf(duration.toHours());
                minutes = String.valueOf(duration.toMinutesPart());
                switch (format){
                    case "simple" -> { return hours + "h" + minutes + "m";}
                    case "full" -> { return "Hours: "+ hours + ", Minutes: " + minutes ;}
                    default -> {return "Invalid format";}
                }
            }
            default -> {return "Invalid unit";}
        }
    }
}
/*
import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class Main {
    public static String calculateDifference(String start, String end, String unit, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime startDate = LocalDateTime.parse(start, formatter);
            LocalDateTime endDate = LocalDateTime.parse(end, formatter);

            switch (unit.toLowerCase()) {
                case "period":
                    Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
                    if (format.equals("full")) {
                        return String.format("Years: %d, Months: %d, Days: %d",
                            period.getYears(), period.getMonths(), period.getDays());
                    } else if (format.equals("simple")) {
                        return String.format("%dy%dm%dd",
                            period.getYears(), period.getMonths(), period.getDays());
                    }
                    break;

                case "duration":
                    Duration duration = Duration.between(startDate, endDate);
                    long hours = duration.toHours();
                    long minutes = duration.toMinutesPart();
                    if (format.equals("full")) {
                        return String.format("Hours: %d, Minutes: %d", hours, minutes);
                    } else if (format.equals("simple")) {
                        return String.format("%dh%dm", hours, minutes);
                    }
                    break;

                default:
                    return "Invalid unit";
            }

            return "Invalid format";

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }
 */