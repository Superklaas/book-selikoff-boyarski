package concurrency_api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GettingResultFuture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            Callable<Integer> task = () -> 30 + 11;
            Future<Integer> result = executorService.submit(task);
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("problem executing task");
        } finally {
            executorService.shutdown();
        }
    }

}
