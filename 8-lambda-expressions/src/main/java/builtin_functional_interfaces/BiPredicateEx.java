package builtin_functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateEx {

    public static void main(String[] args) {

//        BiPredicate<String,String> stringStartChecker = (s1,s2) -> s1.startsWith(s2);

        BiPredicate<String,String> stringStartChecker = String::startsWith;

        boolean test = stringStartChecker.test("klaas", "elodie");
        System.out.println(test);

    }

}
