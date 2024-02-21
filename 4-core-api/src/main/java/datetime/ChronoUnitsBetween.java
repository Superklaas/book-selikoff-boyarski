package datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsBetween {

    public static void main(String[] args) {
        var time1 = LocalTime.of(6, 15);
        var time2 = LocalTime.of(9, 30);
        long hoursBetween = ChronoUnit.HOURS.between(time1, time2);
        long minutesBetween = ChronoUnit.MINUTES.between(time1, time2);
        long secondsBetween = ChronoUnit.SECONDS.between(time1, time2);
        System.out.println(String.format("Hours between: %d; Minutes between: %d; Seconds between: %d",
                hoursBetween, minutesBetween, secondsBetween));
    }

}
