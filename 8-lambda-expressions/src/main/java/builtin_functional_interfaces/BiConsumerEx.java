package builtin_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

//        BiConsumer<Integer, String> putInMap = new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer key, String value) {
//                map.put(key, value);
//            }
//        };

//        BiConsumer<Integer,String> putInMap = (k, v) -> map.put(k,v);
//        BiConsumer<Integer,String> putInMap = (Integer k, String v) -> map.put(k,v);
        BiConsumer<Integer,String> putInMap = (var k, var v) -> map.put(k,v);

//        BiConsumer<Integer,String> putInMap_MR = map::put;

        putInMap.accept(1, "klaas");
        putInMap.accept(2, "elodie");
        System.out.println(map);

    }

}
