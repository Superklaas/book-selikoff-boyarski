package localization;

import java.util.Locale;

public class SelectingLocale {

    public static void main(String[] args) {

        // Locale default
        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale);
        Locale.setDefault(new Locale("fr","CA"));
        System.out.println(Locale.getDefault());
        System.out.println("-------------");

        // Locale constants
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        System.out.println(Locale.JAPAN);
        System.out.println("-------------");

        // Locale constructors
        Locale de = new Locale("de");
        Locale deAT = new Locale("de", "AT");
        Locale deLI = new Locale("de", "LI");
        System.out.println(de);
        System.out.println(deLI);
        System.out.println(deAT);
        System.out.println("-------------");

        // Locale builders
        Locale frCA = new Locale.Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();
        System.out.println(frCA);

    }

}
