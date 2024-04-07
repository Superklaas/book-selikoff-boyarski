package concurrency_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class UsingMethodExecute {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            executorService.execute(() -> System.out.println("printing zoo inventory"));
            executorService.execute(() -> IntStream.range(0,3).forEach(i -> System.out.printf("printing stream record %d%n", i)));
            executorService.execute(() -> System.out.println("printing zoo inventory"));
            System.out.println("end");
        } finally {
            executorService.shutdown();
        }
    }

}
