package builtin_functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

    public static void main(String[] args) {

        BinaryOperator<String> concat = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return s1.concat(s2);
            }
        };

//        BinaryOperator<String> concat = String::concat;

        String concatString = concat.apply("klaas", "elodie");
        System.out.println(concatString);

    }
}
