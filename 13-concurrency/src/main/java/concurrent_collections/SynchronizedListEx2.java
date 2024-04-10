package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListEx2 {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Thread 1
        new Thread(() -> {
            synchronized (synchronizedList) {
                synchronizedList.add("Thread 1");
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            synchronized (synchronizedList) {
                synchronizedList.add("Thread 2");
            }
        }).start();

        // Ensure threads finish before accessing synchronizedList
        Thread.sleep(1000);

        // Access synchronizedList safely
        synchronized (synchronizedList) {
            for (String str : synchronizedList) {
                System.out.println(str);
            }
        }

    }

}
