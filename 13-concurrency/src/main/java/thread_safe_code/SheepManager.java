package thread_safe_code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    // private volatile int sheepCount;
    private final AtomicInteger sheepCount = new AtomicInteger();

    public void incrementSheep() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        try {
            SheepManager sheepManager = new SheepManager();
            Runnable task = sheepManager::incrementSheep;
            for (int i = 0; i < 10; i++) {
                executorService.submit(task);
            }
        } finally {
            executorService.shutdown();
        }
    }

}
