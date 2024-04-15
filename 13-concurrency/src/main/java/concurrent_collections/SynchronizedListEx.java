package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListEx {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        for (Integer integer : synchronizedList) {
            System.out.println(integer);
        }
    }

}
