package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {

    public static void main(String[] args) {

        // NUMBERS

        NumberFormat germanNumberFormatter = NumberFormat.getInstance(Locale.GERMANY);
        String germanNumber = germanNumberFormatter.format(123.45);
        System.out.println(germanNumber);

        NumberFormat chineseNumberFormatter = NumberFormat.getInstance(Locale.CHINA);
        String chineseNumber = chineseNumberFormatter.format(123.45);
        System.out.println(chineseNumber);

        // CURRENCY

        NumberFormat germanCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String germanCurrency = germanCurrencyFormatter.format(123.45);
        System.out.println(germanCurrency);

        NumberFormat chineseCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chineseCurrency = chineseCurrencyFormatter.format(123.45);
        System.out.println(chineseCurrency);

        NumberFormat frenchCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String frenchCurrency = frenchCurrencyFormatter.format(123.45);
        System.out.println(frenchCurrency);

        // PERCENTAGE

        NumberFormat germanPercentageFormatter = NumberFormat.getPercentInstance(Locale.GERMANY);
        String germanPercentage = germanPercentageFormatter.format(123.45);
        System.out.println(germanPercentage);

        NumberFormat chinesePercentageFormatter = NumberFormat.getPercentInstance(Locale.CHINA);
        String chinesePercentage = chinesePercentageFormatter.format(123.45);
        System.out.println(chinesePercentage);

    }

}
