package terminal_operations;

import java.util.stream.Stream;

public class Matching {

    public static void main(String[] args) {

        // anyMatch
        boolean anyMatch = Stream.iterate(2, n -> n + 3)
                .anyMatch(n -> n % 10 == 0);
        System.out.println(anyMatch);

        // allMatch
        boolean allMatch = Stream.of("klaas", "elodie", "sunday", "augustin", "pablo")
                .allMatch(s -> s.length() > 5);
        System.out.println(allMatch);

        // noneMatch
        boolean noneMatch = Stream.generate(() -> Math.round(Math.random() * 100))
                .noneMatch(aLong -> aLong == 75);
        System.out.println(noneMatch);


    }

}
