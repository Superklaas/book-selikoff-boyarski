package intermediate_operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] args) {

        List<Integer> list = Stream.generate(() -> Math.round(Math.random() * 100))
                .limit(10)
                .distinct()
                .map(Long::intValue)
                .sorted((a,b) -> b - a)
                .toList();
        System.out.println(list);

        List<Long> list1 = Stream.generate(() -> Math.round(Math.random() * 100))
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list1);

    }

}
