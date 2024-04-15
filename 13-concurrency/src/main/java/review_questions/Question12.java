package review_questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question12 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        } finally {
            service.shutdown();
        }
        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("DONE!");
    }

    static void takeNap() {
        try {
            Thread.sleep(5000);
            System.out.println("ready taking nap");
        } catch (InterruptedException e) {
            System.out.println("method takeNap() interrupted");
        }
    }

}
