package localization;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class ParsingDates {

    public static void main(String[] args) {

        DateTimeFormatter formatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        // formatter.parse(String) using formatter with FormatStyle.LONG
        TemporalAccessor localDate1 = formatterLong.parse("March 30, 2024");
        System.out.println(localDate1);

        // formatter.parse(String) using formatter with FormatStyle.SHORT
        TemporalAccessor localDate2 = formatterShort.parse("3/30/24");
        System.out.println(localDate2);

        // temporalAccessor.parse(String) using formatter with FormatStyle.SHORT
        LocalDate localDate3 = LocalDate.parse("3/30/24", formatterShort);
        System.out.println(localDate3);

        // temporalAccessor.parse(String) using formatter with FormatStyle.LONG
        LocalDate localDate4 = LocalDate.parse("March 30, 2024", formatterLong);
        System.out.println(localDate4);


    }

}
