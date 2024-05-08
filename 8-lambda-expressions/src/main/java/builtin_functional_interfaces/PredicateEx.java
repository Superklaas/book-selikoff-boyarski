package builtin_functional_interfaces;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {

        Predicate<String> blankStringCheck = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

//        Predicate<String> blankStringCheck = s -> s.isBlank();

//        Predicate<String> blankStringCheck = String::isBlank;

        boolean test = blankStringCheck.test("");
        System.out.println(test);

    }

}
