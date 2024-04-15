package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListEx2 {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);

        new Thread(() -> synchronizedList.add("Thread1")).start();
        new Thread(() -> synchronizedList.add("Thread2")).start();

        Thread.sleep(1000);

        for (String str : synchronizedList) {
            System.out.println(str);
        }

    }

}
