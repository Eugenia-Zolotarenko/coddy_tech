import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MainFormatDate {
    public static void main(String[] args) {
        System.out.println(formatDate("2024-03-15", "basic", "long"));
        System.out.println(formatDate("2024-13-45", "basic", "long"));
        System.out.println(formatDate("2024-03-15", "basic", "dd.MM.yyyy"));
        System.out.println(formatDate("03/15/24", "short", "basic"));
        System.out.println(formatDate("03/15/24", "invalid", "basic"));
       // System.out.println(formatDate("März 15, 2024", "long", "short"));



    }
    public static String formatDate(String dateStr, String inputPattern, String outputPattern) {
        // Write your code here
        LocalDate date;
        String pattern = switch (inputPattern){
                            case "basic"-> "yyyy-MM-dd";
                            case "long" -> "MMMM d, yyyy";
                            case "short" -> "MM/dd/yy";
                            default -> "Invalid pattern";
                        };

        if(pattern.equals("Invalid pattern")) return "Invalid pattern";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            date = LocalDate.parse(dateStr,formatter);

            switch (outputPattern){
                case "basic"-> {
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    date.format(formatter);
                    return  date.format(formatter);
                }
                case "long" -> {
                    formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    return date.format(formatter);
                    }
                case "short" -> {
                    formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
                    date.format(formatter);
                    return date.format(formatter);
                    }
                default -> {
                    formatter = DateTimeFormatter.ofPattern(outputPattern);
                    date.format(formatter);
                    return date.format(formatter);
                }
            }
        } catch (DateTimeParseException e){
            return  "Invalid date format";
        }
    }
}
/*
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static String formatDate(String dateStr, String inputPattern, String outputPattern) {
        try {
            String inPattern = switch(inputPattern) {
                case "basic" -> "yyyy-MM-dd";
                case "long" -> "MMMM d, yyyy";
                case "short" -> "MM/dd/yy";
                default -> inputPattern;
            };

            String outPattern = switch(outputPattern) {
                case "basic" -> "yyyy-MM-dd";
                case "long" -> "MMMM d, yyyy";
                case "short" -> "MM/dd/yy";
                default -> outputPattern;
            };

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inPattern);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outPattern);

            LocalDate date = LocalDate.parse(dateStr, inputFormatter);
            return date.format(outputFormatter);

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        } catch (IllegalArgumentException e) {
            return "Invalid pattern";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        String inputPattern = scanner.nextLine();
        String outputPattern = scanner.nextLine();

        System.out.println(formatDate(dateStr, inputPattern, outputPattern));
    }
}
 */