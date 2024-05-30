package datetime;

import java.time.LocalDate;
import java.time.Period;

public class Immutability {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2022, 2, 3);
        localDate.plus(Period.ofDays(15));
        System.out.println(localDate);

    }

}
