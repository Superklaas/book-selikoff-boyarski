package convenience_methods;

import java.util.function.Consumer;

public class AndThen {

    public static void main(String[] args) {

        Consumer<String> printFirst = s -> System.out.printf("1: %s%n", s);
        Consumer<String> printSecond = s -> System.out.printf("2: %s%n", s);

        Consumer<String> printFirstAndSecond = printFirst.andThen(printSecond);

        printFirstAndSecond.accept("elodie");

    }

}
