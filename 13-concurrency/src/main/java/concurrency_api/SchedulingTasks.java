package concurrency_api;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulingTasks {

    public static void main(String[] args) {

        // scheduleAtFixedRate: every second, task (print random number) will be executed
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        try {
            Runnable task1 = () -> System.out.println(Math.random());
            ScheduledFuture<?> scheduledAtFixedRate = service.scheduleAtFixedRate(task1, 1L, 1L, TimeUnit.SECONDS);
            System.out.println(scheduledAtFixedRate.getDelay(TimeUnit.MICROSECONDS)); // get delay of schedule method
            service.awaitTermination(5L, TimeUnit.SECONDS); // after 5 seconds, terminate thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
        System.out.println("-------------------------");

        // scheduleWithFixedDelay: one second after completion last execution, task will be executed again
        service = Executors.newSingleThreadScheduledExecutor();
        try {
            Runnable task1 = () -> System.out.println(Math.random());
            ScheduledFuture<?> scheduledWithFixedDelay = service.scheduleWithFixedDelay(task1, 1L, 1L, TimeUnit.SECONDS);
            System.out.println(scheduledWithFixedDelay.getDelay(TimeUnit.MICROSECONDS)); // get delay of schedule method
            service.awaitTermination(5L, TimeUnit.SECONDS); // after 5 seconds, terminate thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

    }

}
