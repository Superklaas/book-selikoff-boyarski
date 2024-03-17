package builtin_functional_interfaces;

import java.util.function.Function;

public class FunctionEx {

    public static void main(String[] args) {
        Function<String,Integer> lengthString = String::length;
        Integer length = lengthString.apply("klaas");
        System.out.println(length);
    }

}
