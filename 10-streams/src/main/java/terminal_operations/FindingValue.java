package terminal_operations;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class FindingValue {

    public static void main(String[] args) {

        // findAny v1
        String string = Stream.generate(() -> "Klaas")
                .filter(s -> !s.startsWith("l"))
                .findAny()
                .orElseThrow();
        System.out.println(string);

        // findFirst
        Integer firstMultipleOfTen = Stream.iterate(2, n -> n + 3)
                .filter(n -> n % 10 == 0)
                .findFirst()
                .orElseThrow();
        System.out.println(firstMultipleOfTen);

    }

}
