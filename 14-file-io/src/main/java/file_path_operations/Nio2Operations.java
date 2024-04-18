package file_path_operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Nio2Operations {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("test-directory\\test.txt");
        System.out.println("Relative path name: " + path.getFileName());
        System.out.println("Absolute path name: " + path.isAbsolute());
//        System.out.println("File deleted: " + Files.deleteIfExists(path));
        System.out.println("File exists: " + Files.exists(path));
        System.out.println("Absolute path name of relative path: " + path.toAbsolutePath());
        System.out.println("Path refers to directory: " + Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
        System.out.println("Path refers to file: " + Files.isRegularFile(path));
        System.out.println("Last modification time: " + Files.getLastModifiedTime(path));
        System.out.println("Number of bytes in file: " + Files.size(path));
        if (Files.isDirectory(path)) {
            try(Stream<Path> entries = Files.list(path)) {
                entries.forEach(System.out::println);
            }
        }
        System.out.println("Renamed file: " + Files.move(path, Path.of("test-directory\\testje.txt"), LinkOption.NOFOLLOW_LINKS, StandardCopyOption.REPLACE_EXISTING));
        System.out.println("-----------");

        Path parentDirectory = path.getParent();
        System.out.println("Path name parent: " + parentDirectory.getFileName());
        if (Files.isDirectory(parentDirectory)) {
            try(Stream<Path> entries = Files.list(parentDirectory)) {
                System.out.println("Content of directory:");
                entries.forEach(entry -> System.out.printf(" %s%n", entry.getFileName()));
            }
        }

    }

}
