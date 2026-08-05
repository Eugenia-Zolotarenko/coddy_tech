import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRulesException;


public class MainTimeZoneHandling {
    public static void main(String[] args) {
        System.out.println(convertTime("2024-03-15 14:30", "America/New_York",
                "Asia/Tokyo", false));
        System.out.println(convertTime("2024-03-15 14:30", "America/New_York",
                "Asia/Tokyo", true));
        System.out.println(convertTime("2024-13-45 25:70", "America/New_York",
                "Asia/Tokyo", true));
        System.out.println(convertTime("2024-03-15 14:30", "Invalid/Zone",
                "Asia/Tokyo", false));
        System.out.println(convertTime("2024-03-15 14:30", "Asia/Tokyo",
                "Asia/Tokyo", true));
        System.out.println(convertTime("2024-03-10 01:30", "America/New_York",
                "Europe/London", true));
    }
    public static String convertTime(String dateTimeStr, String sourceZone,
                                     String targetZone, boolean showOffset) {
        String pattern = (showOffset) ? "yyyy-MM-dd HH:mm xxx" : "yyyy-MM-dd HH:mm";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime sourceDate;
        ZonedDateTime zonedSourceDate, zonedTargetDate;
        try {
            sourceDate = LocalDateTime.parse(dateTimeStr, formatter);
            zonedSourceDate = sourceDate.atZone(ZoneId.of(sourceZone));
            zonedTargetDate = zonedSourceDate.withZoneSameInstant(ZoneId.of(targetZone));

        }catch (DateTimeParseException e) {
                return "Invalid datetime format";
        }
         catch (ZoneRulesException e) {
                return "Invalid time zone";
        }
        return "Source: " + zonedSourceDate.format(formatterOut) + ", Target: "+ zonedTargetDate.format(formatterOut);

        // Write your code here
    }
}
