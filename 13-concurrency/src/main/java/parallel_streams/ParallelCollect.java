package parallel_streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelCollect {

    public static void main(String[] args) {

        Map<Integer, String> map = Stream.of("lion", "tiger", "bear")
                .parallel()
                .collect(Collectors.toConcurrentMap(
                        String::length,
                        value -> value,
                        (s1, s2) -> s1 + "," + s2));
        System.out.println(map);

        Map<Integer, List<String>> map1 = Stream.of("lion", "tiger", "bear")
                .parallel()
                .collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map1);

    }

}
