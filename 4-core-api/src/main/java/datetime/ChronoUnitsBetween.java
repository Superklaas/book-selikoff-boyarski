package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitsBetween {

    public static void main(String[] args) {

        // LocalTime
        var time1 = LocalTime.of(6, 15);
        var time2 = LocalTime.of(9, 30);
        long hoursBetween = ChronoUnit.HOURS.between(time1, time2);
        long minutesBetween = ChronoUnit.MINUTES.between(time1, time2);
        long secondsBetween = ChronoUnit.SECONDS.between(time1, time2);
        System.out.printf("Hours between: %d; Minutes between: %d; Seconds between: %d%n",
                hoursBetween, minutesBetween, secondsBetween);

        // LocalDate
        var date1 = LocalDate.of(2024, 2, 4);
        var date2 = LocalDate.of(2024, 5, 2);
        long yearsBetween = ChronoUnit.YEARS.between(date1, date2);
        long monthsBetween = ChronoUnit.MONTHS.between(date1, date2);
        long weeksBetween = ChronoUnit.WEEKS.between(date1, date2);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.printf("Years between: %d; Months between: %d; Weeks between: %d; Days between: %d%n",
                yearsBetween, monthsBetween, weeksBetween, daysBetween);

    }

}
