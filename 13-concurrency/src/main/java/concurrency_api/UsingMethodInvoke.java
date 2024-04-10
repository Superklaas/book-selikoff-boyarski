package concurrency_api;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingMethodInvoke {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Double> task1 = () -> Math.sqrt(12);
        Callable<Double> task2 = () -> Math.sqrt(10);
        try {
            List<Future<Double>> results = executorService.invokeAll(List.of(task1, task2));
            results.stream()
                    .map(f -> {
                        Double result = null;
                        try {
                            result = f.get();
                        } catch (InterruptedException | ExecutionException e) {
                            System.out.println("problem during getting results from return values of task execution");
                        }
                        return result;
                    })
                    .forEach(System.out::println);
        } catch (InterruptedException e) {
            System.out.println("problem during executing tasks");
        } finally {
            executorService.shutdown();
        }
    }

}
