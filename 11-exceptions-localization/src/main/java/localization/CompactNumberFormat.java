package localization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

public class CompactNumberFormat {

    public static void main(String[] args) {

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG),
                NumberFormat.getNumberInstance()
        );
        formatters.map(f -> f.format(123_456_789)).forEach(System.out::println);

        NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT).format(123_456_789);
        NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG).format(123_456_789);

    }

}
