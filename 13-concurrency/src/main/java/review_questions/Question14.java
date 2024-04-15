package review_questions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question14 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(2);
        try {
            Future<?> klaas = service.submit(() -> {
                synchronized (o1) {
                    synchronized (o2) {
                        System.out.println("klaas");
                    }
                }
            });
            Future<?> elodie = service.submit(() -> {
                synchronized (o2) {
                    synchronized (o1) {
                        System.out.println("elodie");
                    }
                }
            });
            klaas.get();
            elodie.get();
        } finally {
            service.shutdown();
        }

    }

}
