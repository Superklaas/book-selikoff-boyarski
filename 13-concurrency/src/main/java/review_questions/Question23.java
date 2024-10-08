package review_questions;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Question23 {

    public static void await(CyclicBarrier cb) { // j1
        try {
            cb.await();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        var cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full!")); // j2
        IntStream.iterate(1, i -> 1)
                .limit(9)
                .parallel()
                .forEach(i -> await(cb)); // j3
    }

}
