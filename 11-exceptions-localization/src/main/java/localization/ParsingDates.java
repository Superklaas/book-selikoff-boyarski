package localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class ParsingDates {

    public static void main(String[] args) {

        // formatter.parse(String) using formatter with FormatStyle.LONG
        TemporalAccessor localDate1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).parse("March 30, 2024");
        System.out.println(localDate1);

        // formatter.parse(String) using formatter with FormatStyle.SHORT
        TemporalAccessor localDate2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).parse("3/30/24");
        System.out.println(localDate2);

        // temporalAccessor.parse(String) using formatter with FormatStyle.SHORT
        LocalDate localDate3 = LocalDate.parse("3/30/24", DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(localDate3);

        // temporalAccessor.parse(String) using formatter with FormatStyle.LONG
        LocalDate localDate4 = LocalDate.parse("March 30, 2024", DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(localDate4);


    }

}
