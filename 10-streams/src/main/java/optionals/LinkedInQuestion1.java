package optionals;

import java.util.Optional;
import java.util.function.Function;

public class LinkedInQuestion1 {

    public static void main(String[] args) {
        Function<String, String> function = String::toUpperCase;
        Optional<String> hello = Optional.of("hello");
        Optional<String> result = hello.map(function).filter(s -> s.equals("HELLO"));
        System.out.println(result.isPresent());
    }

}
