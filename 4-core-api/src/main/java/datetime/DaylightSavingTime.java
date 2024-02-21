package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingTime {

    public static void main(String[] args) {

        /* Time change Sunday March 13 2AM. (begin zomertijd)
        *  If you advance one hour, the hour jumps one hour extra and the offset changes. */
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

        /* Time change Sunday November 6 2AM. (begin wintertijd)
         *  If you advance one hour, the hour jumps one hour extra and the offset changes. */
        date = LocalDate.of(2022, Month.NOVEMBER, 6);
        time = LocalTime.of(1, 30);
        zone = ZoneId.of("US/Eastern");
        dateTime = ZonedDateTime.of(date, time, zone);
        dateTimePlusOneHour = dateTime.plusHours(1);
        System.out.println(dateTime);
        System.out.println(dateTime.toInstant());
        System.out.println(dateTimePlusOneHour);
        System.out.println(dateTimePlusOneHour.toInstant());

    }

}
