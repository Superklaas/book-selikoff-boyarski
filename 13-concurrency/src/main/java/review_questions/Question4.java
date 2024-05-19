package review_questions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(() -> {
            System.out.println("Open Zoo");
//            return null;   // w2
        }, 0, 1, TimeUnit.SECONDS);
        var result = service.submit(() -> System.out.println("Wake Staff"));
        System.out.println(result.get());
    }

}
