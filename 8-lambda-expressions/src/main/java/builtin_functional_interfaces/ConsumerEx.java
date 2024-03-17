package builtin_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("klaas");
    }


}
