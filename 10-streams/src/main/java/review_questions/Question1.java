package review_questions;

import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) {
        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }

}
