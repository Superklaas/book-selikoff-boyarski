package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListEx2 {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        list.add("Before1");
        list.add("Before2");
        list.add("Before3");

        System.out.println(list);
        System.out.println("-----------");

        List<String> synchronizedList = Collections.synchronizedList(list);
        new Thread(() -> synchronizedList.add("Thread1")).start();
        new Thread(() -> synchronizedList.add("Thread2")).start();
        Thread.sleep(1000);

        System.out.println(synchronizedList);

    }

}
