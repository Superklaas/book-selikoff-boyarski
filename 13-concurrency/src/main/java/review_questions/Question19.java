package review_questions;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.DoubleStream;

public class Question19 {

    public static void main(String[] args) {
        ScheduledExecutorService s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14, 2.71)
                .forEach(c -> s.submit(() -> System.out.println(10 * c)));
        s.execute(() -> System.out.println("printed"));
    }

}
