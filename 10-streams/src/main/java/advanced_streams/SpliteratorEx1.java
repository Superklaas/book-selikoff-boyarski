package advanced_streams;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * Example spliterator for finite stream
 */
public class SpliteratorEx1 {

    public static void main(String[] args) {

        List<String> list = List.of("bunny", "bird", "cat", "goat", "camel", "fish", "monkey");
        Stream<String> stream = list.stream();
        Spliterator<String> originalBag = stream.spliterator();

        Spliterator<String> bagChild1 = originalBag.trySplit();
        bagChild1.forEachRemaining(System.out::println);
        System.out.println("--------------");

        Spliterator<String> bagChild2 = originalBag.trySplit();
        bagChild2.tryAdvance(System.out::println);
        bagChild2.forEachRemaining(System.out::println);
        System.out.println("-------------");

        originalBag.forEachRemaining(System.out::println);

    }

}
