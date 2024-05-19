package concurrency_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadPools {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable task0 = () -> IntStream.range(0,10).forEach(System.out::println);
        Runnable task1 = () -> IntStream.range(100,110).forEach(System.out::println);
        Runnable task2 = () -> IntStream.range(200,210).forEach(System.out::println);
        Runnable task3 = () -> IntStream.range(300,310).forEach(System.out::println);

//        long start = System.nanoTime();
        long start = System.currentTimeMillis();

        try {
            executorService.submit(task0);
            executorService.submit(task1);
            executorService.submit(task2);
            executorService.submit(task3);
        } finally {
            executorService.shutdown();
        }

        // polling method: wait termination throws InterruptedException when done - current thread interrupted
        try {
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                System.err.println("ExecutorService did not terminate in time.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

//        System.out.println("Elapsed time: " + (System.nanoTime() - start) + " nanoseconds");
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start) + " milliseconds");

    }

}
