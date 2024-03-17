package builtin_functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {
        BiFunction<String,String,Integer> lengthConcat = (s1,s2) -> s1.concat(s2).length();
        Integer length = lengthConcat.apply("klaas", "elodie");
        System.out.println(length);
    }

}
