package concurrency_api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingMethodSubmit {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Long> task1 = () -> Math.round(Math.sqrt(12));
        Callable<String> task2 = "klaas"::toUpperCase;
        try {
            Future<Long> result1 = executorService.submit(task1);
            Future<String> result2 = executorService.submit(task2);
            System.out.println(result1.get());
            System.out.println(result2.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }

}
