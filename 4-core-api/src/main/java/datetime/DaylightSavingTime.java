package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DaylightSavingTime {

    public static void main(String[] args) {

        /**
         * SPRING = SPRING FORWARD
         * Time change Sunday March 13 2AM. (begin zomertijd)
         * If you advance one hour, the hour jumps one hour extra forward.
         * The offset changes from GMT-5 to GMT-4. */
        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        var dateTimePlusOneHour = dateTime.plusHours(1);
        System.out.println(dateTime);
        System.out.println(dateTime.toInstant());
        System.out.println(dateTimePlusOneHour);
        System.out.println(dateTimePlusOneHour.toInstant());
        System.out.println("-----------------");

        /**
         * FALL = FALL BACK
         * Time change Sunday November 6 2AM. (begin wintertijd)
         * If you advance one hour, the hour stays the same.
         * The offset changes from GMT-4 to GMT-5.  */
        date = LocalDate.of(2022, Month.NOVEMBER, 6);
        time = LocalTime.of(1, 30);
        zone = ZoneId.of("US/Eastern");
        dateTime = ZonedDateTime.of(date, time, zone);
        dateTimePlusOneHour = dateTime.plusHours(1);
        System.out.println(dateTime);
        System.out.println(dateTime.toInstant());
        System.out.println(dateTimePlusOneHour);
        System.out.println(dateTimePlusOneHour.toInstant());
        System.out.println("-----------------");

        /* Review question on daylight saving time */
        LocalDate date1 = LocalDate.of(2022, 03, 13);
        LocalTime time1 = LocalTime.of(02, 15);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date1, time1, ZoneId.of("US/Eastern"));
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime1.minus(1L, ChronoUnit.HOURS));

    }

}
