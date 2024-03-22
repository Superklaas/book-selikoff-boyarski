package terminal_operations;

import java.util.stream.Stream;

public class Matching {

    public static void main(String[] args) {

        boolean match = Stream.iterate(2, n -> n + 3)
                .anyMatch(n -> n % 10 == 0);
        System.out.println(match);

        Integer firstMultiple10 = Stream.iterate(2, n -> n + 3)
                .filter(n -> n % 10 == 0)
                .findFirst()
                .orElseThrow();
        System.out.println(firstMultiple10);

    }

}
