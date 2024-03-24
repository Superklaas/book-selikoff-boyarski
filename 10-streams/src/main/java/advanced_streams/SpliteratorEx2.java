package advanced_streams;

import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorEx2 {

    public static void main(String[] args) {
        Spliterator<Integer> spliterator = Stream.iterate(1, integer -> ++integer).spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();
        Spliterator<Integer> spliterator2 = spliterator.trySplit();
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);
        spliterator1.tryAdvance(System.out::println);
        spliterator2.tryAdvance(System.out::println);
        // spliterator.forEachRemaining(System.out::println); // will print infinitely
    }

}
