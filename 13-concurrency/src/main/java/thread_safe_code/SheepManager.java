package thread_safe_code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {

    // private volatile int sheepCount;
    private final AtomicInteger sheepCount = new AtomicInteger();

    /**
     * Asynchronous execution
     */
    public void incrementSheepAsynchronous() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }

    /**
     * Synchronous execution: synchronized block
     */
    public void incrementSheepSynchronous1() {
        synchronized (this) {
            System.out.print(sheepCount.incrementAndGet() + " ");
        }
    }

    /**
     * Synchronous execution: synchronized modifier in method declaration
     */
    public synchronized void incrementSheepSynchronous2() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        SheepManager sheepManager = new SheepManager();
        Runnable task = sheepManager::incrementSheepSynchronous2;
        try {
            for (int i = 0; i < 100; i++) {
                executorService.submit(task);
            }
        } finally {
            executorService.shutdown();
        }
    }

}
