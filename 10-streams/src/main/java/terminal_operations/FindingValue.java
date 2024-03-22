package terminal_operations;

import java.util.stream.Stream;

public class FindingValue {

    public static void main(String[] args) {
        String string = Stream.generate(() -> "Klaas")
                .filter(s -> !s.startsWith("l"))
                .findAny()
                .orElseThrow();
        System.out.println(string);
    }

}
