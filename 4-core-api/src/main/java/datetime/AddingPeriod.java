package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class AddingPeriod {

    public static void main(String[] args) {
        var date = LocalDate.of(2024, Month.FEBRUARY,21);
        var time = LocalTime.of(9,11);
        var dateTime = LocalDateTime.of(date,time);
        var period = Period.ofMonths(1);
        System.out.println(dateTime.plus(period));
        System.out.println(date.plus(period));
        System.out.println(time.plus(period));
    }

}
