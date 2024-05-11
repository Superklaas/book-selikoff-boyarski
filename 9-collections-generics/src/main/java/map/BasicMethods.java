package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

public class BasicMethods {

    public static void main(String[] args) {

        HashMap<String, String> foodMap = new HashMap<>();
        foodMap.put("lion", "meat");
        foodMap.put("giraffe", "leaves");
        foodMap.put("panda", "bamboo");
        System.out.println(foodMap);
        System.out.println(foodMap.get("klaas"));
        for (String value : foodMap.values()) {
            System.out.print(value + "-");
        }
        System.out.println("\n---------");

        TreeMap<String, String> treeMap = new TreeMap<>(foodMap);
        System.out.println(treeMap);
        System.out.println(treeMap.remove("lion"));
        System.out.println(treeMap.remove("klaas"));
        System.out.println(treeMap.replace("giraffe", "white widow"));
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
