package concurrent_collections;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMapEx {

    public static void main(String[] args) {
//        Map<Integer, String> map = new ConcurrentHashMap<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sunday");
        map.put(2, "augustin");
        for (Integer key : map.keySet()) { // ConcurrentModificationException at runtime
            map.remove(key);
        }
        System.out.println(map); // {}
    }

}
