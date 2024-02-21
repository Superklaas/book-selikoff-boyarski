package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class InstantMethods {

    public static void main(String[] args) {

        System.out.println(ZonedDateTime.now());

        // create ZonedDateTime: meeting time in timezone Brussels
        ZoneId europeZone = ZoneId.ofOffset("UTC", ZoneOffset.ofHours(1));
        ZonedDateTime europeTime = ZonedDateTime.of(LocalDateTime.of(2022, 7, 10, 10, 30), europeZone);
        System.out.println("ZonedDateTime CET: " + europeTime);

        // conversion ZonedDateTime to Instant
        Instant instant = europeTime.toInstant();
        System.out.println("Instant UTC: " + instant);

        // conversion Instant to ZonedDateTime: get meeting time in timezone Los Angeles
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime losAngelesTime = ZonedDateTime.ofInstant(instant, losAngelesZone);
        System.out.println("ZonedDateTime US: " + losAngelesTime);

    }

}
