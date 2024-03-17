package builtin_functional_interfaces;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        Predicate<String> blankStringCheck = String::isBlank;
        boolean test = blankStringCheck.test("");
        System.out.println(test);
    }

}
