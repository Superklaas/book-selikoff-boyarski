package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class SpecifyingLocaleCategory {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        System.out.printf("%s - %s%n",
                NumberFormat.getCurrencyInstance().format(1.23),
                new Locale("es", "ES").getDisplayLanguage());

        Locale.setDefault(Locale.Category.DISPLAY, new Locale("es", "ES"));
        System.out.printf("%s - %s%n",
                NumberFormat.getCurrencyInstance().format(1.23),
                new Locale("es", "ES").getDisplayLanguage());

        Locale.setDefault(Locale.Category.FORMAT, new Locale("es", "ES"));
        System.out.printf("%s - %s%n",
                NumberFormat.getCurrencyInstance().format(1.23),
                new Locale("es", "ES").getDisplayLanguage());

    }

}
