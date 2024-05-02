package chapter1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Question15 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, Month.APRIL, 17);
        Duration duration = Duration.ofDays(1);
        LocalDate earlier = localDate.minus(duration);
        System.out.println(earlier);
    }

}
