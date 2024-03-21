package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

public class BasicMethods {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lion", "meat");
        hashMap.put("giraffe", "leaves");
        hashMap.put("panda", "bamboo");
        System.out.println(hashMap);
        System.out.println(hashMap.get("klaas"));
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
        System.out.println("---------");

        TreeMap<String, String> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        System.out.println(treeMap.remove("lion"));
        System.out.println(treeMap.remove("klaas"));
        System.out.println(treeMap.replace("giraffe", "whitewidow"));
        System.out.println(treeMap);
        treeMap.replaceAll((key, value) -> key.concat(value).toUpperCase().concat("$$$$"));
        System.out.println(treeMap);
        System.out.println("--------");

        Supplier<Map<String,String>> creatingHashMap = () -> {
            HashMap<String,String> map = new HashMap<>();
            map.put("klaas", "jongen");
            map.put("elodie", "meisje");
            map.put("sunday", "meisje of jongen");
            map.put("augustin", "jongen");
            return map;
        };
        System.out.printf("Creating HashMap takes %s ns%n", getExecutionTime(creatingHashMap));

        Supplier<Map<String,String>> creatingTreeMap = () -> {
            TreeMap<String,String> map = new TreeMap<>();
            map.put("klaas", "jongen");
            map.put("elodie", "meisje");
            map.put("sunday", "meisje of jongen");
            map.put("augustin", "jongen");
            return map;
        };
        System.out.printf("Creating TreeMap takes %s ns%n", getExecutionTime(creatingTreeMap));

    }

    public static long getExecutionTime(Supplier<Map<String,String>> supplier) {
        long start = System.nanoTime();
        Map<String, String> map = supplier.get();
        long stop = System.nanoTime();
        System.out.println(map);
        return stop - start;
    }

}
