package parallel_streams;

import java.util.List;
import java.util.stream.Stream;

public class UnorderedStream {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6)
                .parallel()
                .findAny()
                .ifPresent(System.out::println);
        System.out.println("---------");

        Stream.of(1, 2, 3, 4, 5, 6)
                .parallel()
                .unordered()
                .skip(2)
                .forEach(System.out::println);

    }

}
