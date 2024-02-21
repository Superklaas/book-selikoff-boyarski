package datetime;

import java.time.Period;
import java.time.ZonedDateTime;

public class DateTimeMethods {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Period period = Period.of(1, 1, 1);
        System.out.println(period);

        Period period1 = Period.ofWeeks(3);
        System.out.println(period1);

        Period period2 = Period.ofMonths(2);
        System.out.println(period2);

    }

}
