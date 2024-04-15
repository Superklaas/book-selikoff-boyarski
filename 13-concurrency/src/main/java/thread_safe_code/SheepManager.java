package thread_safe_code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    // private volatile int sheepCount;
    private final AtomicInteger sheepCount = new AtomicInteger();

    public void incrementSheepSynchronous() {
        synchronized (this) {
            System.out.print(sheepCount.incrementAndGet() + " ");
        }
    }

    public void incrementSheepAsynchronous() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        SheepManager sheepManager = new SheepManager();
        Runnable task = sheepManager::incrementSheepAsynchronous;

        try {
            for (int i = 0; i < 100; i++) {
                executorService.submit(task);
            }
        } finally {
            executorService.shutdown();
        }

    }

}
