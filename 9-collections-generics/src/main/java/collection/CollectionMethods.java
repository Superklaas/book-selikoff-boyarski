package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Klaas");
        list.add("Elodie");
        list.add("");
        list.removeIf(string -> string.startsWith("K"));
        list.removeIf(String::isEmpty);
        list.add("Joe Biden");
        list.forEach(s -> System.out.println(s.toUpperCase()));
    }

}
