package primitive_streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CreatingPrimitiveStreams {

    public static void main(String[] args) {
        DoubleStream empty = DoubleStream.empty();
        IntStream intStream = IntStream.of(1, 2);
        LongStream generate = LongStream.generate(() -> Math.round(Math.random() * 100));
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(i -> System.out.print(i + "-"));
    }

}
