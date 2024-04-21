package review_questions;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question4 {

    public static void main(String[] args) {
        try {
            Question4 main = new Question4();
            main.removeBadFile(Path.of("test-directory\\empty-directory"));
            main.removeBadFile(Path.of("test-directory"));
        } catch (DirectoryNotEmptyException e) {
            System.err.println("directory not empty");
        } catch (IOException e) {
            System.err.println("other io exception");
        }
    }

    public void removeBadFile(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            boolean fileExists = Files.deleteIfExists(path);
            System.out.println(fileExists ? "Success" : "Try Again");
        }
    }

}
