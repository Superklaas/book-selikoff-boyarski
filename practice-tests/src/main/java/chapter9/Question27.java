package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Question27 {

    public static void main(String[] args) throws IOException {
        final var m = Path.of("coffee");
        try (Stream<Path> stream = Files.walk(m)) {
            stream.filter(Files::isDirectory).forEach(Files::isDirectory);
        }
    }

}
