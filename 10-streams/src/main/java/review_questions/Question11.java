package review_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11 {

    public static void main(String[] args) {

        // post-increment stream
        String string = Stream.iterate(1, x -> x++)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining());
        System.out.println(string);

        // post-increment fori
        String result = "";
        for (int i = 1; i <= 5; i++) {
            result += i;
        }
        System.out.println(result);

        // pre-increment stream
        String string1 = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining());
        System.out.println(string1);

        // pre-increment fori
        String result1 = "";
        for (int i = 1; i <= 5; ++i) {
            result1 += i;
        }
        System.out.println(result1);

    }

}
