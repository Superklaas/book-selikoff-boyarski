package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Question24 {

    public static void main(String[] args) throws IOException {
        Path p = Path.of("test-directory");
        Files.find(p,Integer.MAX_VALUE, (w,a) -> w.toAbsolutePath().toString().endsWith(".txt"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println(p);
    }

}
