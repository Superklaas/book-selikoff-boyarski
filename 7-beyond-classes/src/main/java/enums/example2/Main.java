package enums.example2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Season spring = Season.SPRING;
        System.out.println("Season.SPRING = " + spring);
        System.out.println("Season.SPRING.name() = " + spring.name());
        System.out.println("Season.SPRING.ordinal() = " + spring.ordinal());

        Season[] seasonArray = Season.values();
        System.out.println("Season.values() = " + Arrays.toString(seasonArray));

        Season spring1 = Season.valueOf("SPRING");
        System.out.println("Season.valueOf(\"SPRING\") = " + spring1);

    }

}
