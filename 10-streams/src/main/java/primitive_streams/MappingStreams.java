package primitive_streams;

import java.util.function.IntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingStreams {

    public static void main(String[] args) {

        // convert Stream<Integer> to DoubleStream
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        DoubleStream doubleStream = integerStream.mapToDouble(n -> (double) n / 5);
        doubleStream.forEach(System.out::println);
        System.out.println("--------------");

        // convert IntStream to Stream<Double>
        IntStream intStream = IntStream.of(1, 2, 3);
        Stream<Double> doubleStream1 = intStream.mapToObj(n -> n * Math.random());
        doubleStream1.forEach(System.out::println);

    }

}
