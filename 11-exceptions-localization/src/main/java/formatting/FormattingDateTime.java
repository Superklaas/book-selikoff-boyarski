package formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024, 3, 30);
        LocalTime localTime = LocalTime.of(11, 15);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 3, 30, 14, 15);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));

        // option 1: use DateTimeFormatter constants
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(localTime));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));
        System.out.println("----------");

        // option 2: use DateTimeFormatter.ofPattern
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss").format(localTime));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy h:mma"))); // a = am/pm
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy h:mma z").format(zonedDateTime)); // z = time zone name
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy h:mma Z"))); // Z = time zone offset

        // add custom text values
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Party:' dd/MM/yyyy 'at' hh:mma");
        System.out.println(formatter.format(localDateTime));

    }

}
