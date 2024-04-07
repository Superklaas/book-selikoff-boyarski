package concurrency_api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            Callable<String> task = () -> "klaas".concat("elodie");
            executorService.submit(task);
            executorService.shutdown();
            boolean terminated = executorService.awaitTermination(10, TimeUnit.MICROSECONDS);
            System.out.println(terminated ? "all tasks terminated" : "at least one task is still running");
        } catch (InterruptedException e) {
            System.out.println("execution tasks interrupted");
        }
    }

}
