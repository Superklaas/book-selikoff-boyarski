package builtin_functional_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

    public static void main(String[] args) {
        BinaryOperator<String> concat = String::concat;
        String concatString = concat.apply("klaas", "elodie");
        System.out.println(concatString);
    }
}
