package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreatingZonedDateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024, 5, 2);
        LocalTime localTime = LocalTime.of(14, 35, 50);
        ZoneId brusselsTimeZone = ZoneId.of("Europe/Brussels");
        ZonedDateTime brusselsTime = ZonedDateTime.of(localDate, localTime, brusselsTimeZone);
        System.out.println("brusselsTime: " + brusselsTime);

        Instant instant = brusselsTime.toInstant();
        System.out.println("instant: " + instant);

        ZoneId californiaTimeZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime californiaTime = instant.atZone(californiaTimeZone);
        System.out.println("californiaTime: " + californiaTime);

        ZoneId londonTimeZone = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = instant.atZone(londonTimeZone);
        System.out.println("londonTime: " + londonTime);

    }

}
