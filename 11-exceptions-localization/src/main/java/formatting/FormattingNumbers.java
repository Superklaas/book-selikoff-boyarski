package formatting;

import java.text.DecimalFormat;

public class FormattingNumbers {

    public static void main(String[] args) {

        DecimalFormat format1 = new DecimalFormat("000,000,000.00000");
        DecimalFormat format2 = new DecimalFormat("###,###.000000");
        DecimalFormat format3 = new DecimalFormat("###,###");
        DecimalFormat format4 = new DecimalFormat("Your balance: $#,###.##");

        double numberDouble = 1234.73;
        long numberLong = 1234567L;

        System.out.println(format1.format(numberDouble));
        System.out.println(format2.format(numberDouble));
        System.out.println(format3.format(numberDouble));
        System.out.println(format4.format(numberDouble));
        System.out.println("-----------");

        System.out.println(format1.format(numberLong));
        System.out.println(format2.format(numberLong));
        System.out.println(format3.format(numberLong));
        System.out.println(format4.format(numberLong));

        String string1234 = new DecimalFormat("###,###.00").format(1234);
        System.out.println(string1234);

    }

}
