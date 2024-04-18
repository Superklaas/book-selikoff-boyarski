package file_path_operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatingDirectories {

    public static void main(String[] args) throws IOException {

        Path fieldPath = Path.of("test-directory/bison/field");
        Path pasturePath = Path.of("test-directory/bison/field/pasture");

        // Files.createDirectories(Path): create directory and all missing directories in path
        Path directory = Files.createDirectories(fieldPath);
        System.out.println(directory);

        // Files.createDirectories(Path): nothing happens if directory already exists
        Path directory2 = Files.createDirectories(fieldPath);
        System.out.println(directory2);

        // Files.createDirectory(Path): create directory, throws exception if directories in path are missing
        Path directory1 = Files.createDirectory(pasturePath);
        System.out.println(directory1);

    }

}
