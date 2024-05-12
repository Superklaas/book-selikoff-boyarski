package stream_source;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class StreamSourceEx {

    public static void main(String[] args) {

        // Stream.iterate(): powers of 2, smaller than 10.000
        Stream.iterate(1, n -> n < 10_000, n -> n * 2)
                .forEach(System.out::println);
        System.out.println("---------------");

        // collection.parallelStream(): guitarists with name starting with J
        List.of("jimi","jimmy","eric","mark","bb").parallelStream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .forEach(System.out::println);
        System.out.println("-------------------");

        // Stream.generate(): 10 random numbers between 1 and 99
        Stream.generate(() -> Math.round(Math.random() * 100))
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------------");

        // Stream.generate(): 10 alternating strings
        AtomicBoolean klaasTurn = new AtomicBoolean(true);
        Stream.generate(() -> {
                    boolean currentTurn = klaasTurn.getAndSet(!klaasTurn.get());
                    return currentTurn ? "Klaas" : "Elodie";
                })
                .limit(10)
                .forEach(System.out::println);

    }

}
