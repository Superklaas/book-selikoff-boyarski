package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalizingNumbers {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        // NUMBERS: getInstance(Locale) or getNumberInstance(Locale)

        NumberFormat germanNumberFormatter = NumberFormat.getInstance(Locale.GERMANY);
        String germanNumber = germanNumberFormatter.format(123.45);
        System.out.println(germanNumber);

        NumberFormat chineseNumberFormatter = NumberFormat.getNumberInstance();
        String chineseNumber = chineseNumberFormatter.format(123.45);
        System.out.println(chineseNumber);

        // CURRENCY: getCurrencyInstance(Locale)

        NumberFormat germanCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String germanCurrency = germanCurrencyFormatter.format(123.45);
        System.out.println(germanCurrency);

        NumberFormat chineseCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chineseCurrency = chineseCurrencyFormatter.format(123.45);
        System.out.println(chineseCurrency);

        NumberFormat englishCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
        String frenchCurrency = englishCurrencyFormatter.format(123.45);
        System.out.println(frenchCurrency);

        // PERCENTAGE: getPercentInstance(Locale)

        NumberFormat germanPercentageFormatter = NumberFormat.getPercentInstance(Locale.GERMANY);
        String germanPercentage = germanPercentageFormatter.format(123.4567);
        System.out.println(germanPercentage);

        NumberFormat chinesePercentageFormatter = NumberFormat.getPercentInstance(Locale.CHINA);
        String chinesePercentage = chinesePercentageFormatter.format(123.4567);
        System.out.println(chinesePercentage);

    }

}
