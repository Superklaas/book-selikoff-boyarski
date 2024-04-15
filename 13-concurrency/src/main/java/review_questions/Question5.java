package review_questions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Question5 {

    public static void main(String[] args) {

        var value1 = new AtomicLong(0);
        final long[] value2 = {0};

        // atomic variable: write operations in different threads won't interfere with one another
        IntStream.iterate(1, i -> 1)
                .limit(100)
                .parallel()
                .forEach(i -> value1.incrementAndGet());

        // non-atomic variable: different threads can interfere with one another
        IntStream.iterate(1, i -> 1)
                .limit(100)
                .parallel()
                .forEach(i -> ++value2[0]);

        System.out.println(value1 + " " + value2[0]);

    }

}
