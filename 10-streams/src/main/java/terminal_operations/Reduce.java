package terminal_operations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {

        // Optional<T> reduce(BinaryOperator accumulator) on list with elements
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Optional<Integer> product1 = list.stream().reduce((a, b) -> a * b);
        product1.ifPresent(System.out::println);

        // Optional<T> reduce(BinaryOperator accumulator) on empty list
        Stream<Integer> empty = Stream.empty();
        Optional<Integer> productEmptyList = empty.reduce((a, b) -> a * b);
        System.out.println(productEmptyList);

        // U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
        Integer product2 = list.stream()
                .reduce(1, (a, b) -> a * b, (a, b) -> a * b);
        System.out.println(product2);

    }

}
