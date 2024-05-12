package optionals;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalEx {

    public static void main(String[] args) {
        Optional<Double> averageResult = getAverageResult1(48,78,62,59,71,62,73,76,50);
        // option 1: ifPresent()
        averageResult.ifPresent(System.out::println);
        // option 2: isPresent() - get()
        if (averageResult.isPresent()) {
            System.out.println(averageResult.get());
        } else if (averageResult.isEmpty()) {
            System.out.println("no results");
        }
        // option 3: dealing with empty optional
        Double v = averageResult.orElse(Math.random());
        Double v1 = averageResult.orElseGet(() -> Math.random());
        Double v2 = averageResult.orElseThrow();
        Double v3 = averageResult.orElseThrow(() -> new IllegalArgumentException("no results in method argument"));
    }

    /**
     * Using Optional.ofNullable()
     */
    static Optional<Double> getAverageResult1(int... results) {
        int sum = 0;
        for (int result : results) sum += result;
        return Optional.ofNullable((double) sum / results.length);
    }

    /**
     * Using Optional.of() & Optional.empty()
     */
    static Optional<Double> getAverageResult2(int... results) {
        if (results == null) return Optional.empty();
        int sum = 0;
        for (int result : results) sum += result;
        return Optional.of((double) sum / results.length);
    }

}
