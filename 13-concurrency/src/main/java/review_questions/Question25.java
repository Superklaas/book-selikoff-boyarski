package review_questions;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Question25 {

    public static void performCount(int animal) {}

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS));
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        var r = new ArrayList<Future<?>>();
        ExecutorService s = Executors.newSingleThreadExecutor();
        try {
            for (int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal)));
            }
            r.forEach(f -> printResults(f));
        } finally {
            s.shutdown();
        }
    }


}
