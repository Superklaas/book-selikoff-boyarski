package builtin_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer,String> putInMap = map::put;
        putInMap.accept(1,"klaas");
        putInMap.accept(2,"elodie");
        System.out.println(map);
    }

}
