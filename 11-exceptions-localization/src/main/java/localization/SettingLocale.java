package localization;

import java.util.Locale;

/**
 * Setting locale: default, constants, constructor, builder
 */
public class SettingLocale {

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
        System.out.println(Locale.JAPANESE);
        System.out.println("-------------");

        // Locale constructors
        System.out.println(new Locale("de"));
        System.out.println(new Locale("de", "LI"));
        System.out.println(new Locale("de", "AT"));
        System.out.println("-------------");

        // Locale builders
        Locale frCA = new Locale.Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();
        System.out.println(frCA);

    }

}
