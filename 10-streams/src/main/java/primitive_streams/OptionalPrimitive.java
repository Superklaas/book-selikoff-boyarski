package primitive_streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitive {

    public static void main(String[] args) {

        OptionalInt i = IntStream.rangeClosed(1,10).max();
        i.ifPresent(System.out::println);
        System.out.println(i.orElseGet(() -> 1));

        OptionalDouble average = DoubleStream.generate(Math::random)
                .limit(3)
                .average();
        average.ifPresent(System.out::println);

        OptionalLong min = LongStream.iterate(100, n -> n > 0, n -> n - 5).min();
        min.ifPresent(System.out::println);

    }

}
