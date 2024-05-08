package convenience_methods;

import java.util.function.Predicate;

public class LogicalOperators {

    public static void main(String[] args) {
        
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        
        Predicate<String> brownEggsTester = egg.and(brown);
        Predicate<String> otherEggsTester = egg.and(brown.negate());
        Predicate<String> allEggsAndBrownThingsTester = egg.or(brown);

        String brownEggs = "brown eggs";
        String whiteEggs = "white eggs";
        String brownBear = "brown bear";

        System.out.println(brownEggsTester.test(brownEggs));
        System.out.println(brownEggsTester.test(whiteEggs));
        System.out.println(brownEggsTester.test(brownBear));
        System.out.println("------------");

        System.out.println(otherEggsTester.test(brownEggs));
        System.out.println(otherEggsTester.test(whiteEggs));
        System.out.println(otherEggsTester.test(brownBear));
        System.out.println("------------");

        System.out.println(allEggsAndBrownThingsTester.test(brownEggs));
        System.out.println(allEggsAndBrownThingsTester.test(whiteEggs));
        System.out.println(allEggsAndBrownThingsTester.test(brownBear));
        System.out.println("------------");

    }

}
