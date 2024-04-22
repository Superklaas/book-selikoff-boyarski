package H_review_questions;

import java.io.IOException;
import java.nio.file.Path;

public class Question23 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("test-directory/fluffy/..");
        System.out.println(path.normalize());
        System.out.println(path.toRealPath());
        System.out.println(path.toRealPath().getParent());
    }

}
