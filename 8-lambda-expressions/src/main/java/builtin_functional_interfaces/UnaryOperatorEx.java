package builtin_functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {
        UnaryOperator<String> lowerCaseConverter = String::toLowerCase;
        String lowerCaseString = lowerCaseConverter.apply("KLAAS");
        System.out.println(lowerCaseString);
    }

}
