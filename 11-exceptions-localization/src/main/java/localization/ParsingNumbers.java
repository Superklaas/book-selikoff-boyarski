package localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsingNumbers {

    public static void main(String[] args) throws ParseException {

        // NUMBER: decimal separator cf. chosen locale

        Number usaNumber = NumberFormat.getInstance(Locale.US).parse("123.45");
        Number frenchNumberPeriod = NumberFormat.getInstance(Locale.FRANCE).parse("123.45");
        Number frenchNumberComma = NumberFormat.getInstance(Locale.FRANCE).parse("123,45");

        System.out.println(usaNumber);
        System.out.println(frenchNumberPeriod);
        System.out.println(frenchNumberComma);
        System.out.println("---------------");

        // CURRENCY: decimal separator & currency symbol cf. chosen locale

        Number usaCurrency = NumberFormat.getCurrencyInstance(Locale.US).parse("$123.45");
        System.out.println(usaCurrency);

    }

}
