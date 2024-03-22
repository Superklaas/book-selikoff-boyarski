package stream_source;

import java.util.List;
import java.util.stream.Stream;

public class StreamSourceEx {

    public static void main(String[] args) {

        Stream.iterate(1, n -> n < 10_000, n -> n * 2)
                .forEach(System.out::println);
        System.out.println("---------------");

        Stream.generate(() -> Math.round(Math.random() * 100))
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------------");

        List.of("jimi","jimmy","eric","mark","bb").parallelStream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .forEach(System.out::println);

    }

}
