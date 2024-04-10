package concurrent_collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(List.of(1,2,3));
        for (Integer i : list) {
            list.add(i + 3);
        }
        System.out.println(list);
    }

}
