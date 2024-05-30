package H_review_questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Question23 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("test-directory/fluffy/..");
        System.out.println(path.normalize());
        Files.walk(path.toRealPath().getParent())
                .map(p -> p.toAbsolutePath().toString())
                .filter(s -> s.endsWith(".java"))
                .forEach(System.out::println);
    }

}
