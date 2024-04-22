package H_review_questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Question8 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("test-directory/food-schedule.csv");
        Stream<String> stream = Files.lines(path);
        try (stream) {
            stream.flatMap(s -> Stream.of(s.split(",")))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        }
    }

}
