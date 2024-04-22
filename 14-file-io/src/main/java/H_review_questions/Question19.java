package H_review_questions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question19 {

    public static void main(String[] args) throws IOException {
        Path p1 = Path.of("/test-directory", ".").resolve(Path.of("walking.txt"));
        Path p2 = new File("/test-directory/././actions/../walking.txt").toPath();
        System.out.println(p1.normalize());
        System.out.println(p2.normalize());
        System.out.println(Files.isSameFile(p1, p2));
        System.out.println(p1.equals(p2));
        System.out.println(Files.mismatch(p1, p2));
    }

}
