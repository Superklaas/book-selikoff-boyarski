package concurrency_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadPools {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Runnable task0 = () -> IntStream.range(0,10).forEach(System.out::println);
        Runnable task1 = () -> IntStream.range(100,110).forEach(System.out::println);
        Runnable task2 = () -> IntStream.range(200,210).forEach(System.out::println);
        Runnable task3 = () -> IntStream.range(300,310).forEach(System.out::println);
        try {
            executorService.submit(task0);
            executorService.submit(task1);
            executorService.submit(task2);
            executorService.submit(task3);
        } finally {
            executorService.shutdown();
        }
    }


}
