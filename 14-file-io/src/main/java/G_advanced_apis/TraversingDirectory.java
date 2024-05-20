package G_advanced_apis;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TraversingDirectory {

    public static void main(String[] args) throws IOException {

        TraversingDirectory traversingDirectory = new TraversingDirectory();
        Path path = Paths.get("test-directory");

        long sizeFiles = traversingDirectory.getSizeFiles(path);
        System.out.printf("Size files: %d bytes%n", sizeFiles);

        long sizeDirectories = traversingDirectory.getSizeDirectories(path);
        System.out.printf("Size directories: %d bytes%n", sizeDirectories);

        long sizeTxtFiles = traversingDirectory.getSizeTxtFiles(path);
        System.out.printf("Size txt files: %d bytes%n", sizeTxtFiles);
        System.out.println("----------------");

        traversingDirectory.printPathTxtFiles(path);

    }

    void printPathTxtFiles(Path path) throws IOException {
        Stream<Path> streamTxtFiles = Files.find(path, 10, (p, a) -> a.isRegularFile() && p.toString().endsWith(".txt"));
        try (streamTxtFiles) {
            System.out.println("Txt files in directory:");
            streamTxtFiles.forEach(p -> System.out.println(" ".concat(p.toString())));
        }
    }

    long getSizeTxtFiles(Path path) throws IOException {
        try (Stream<Path> stream = Files.find(path, 10,
                (p,a) -> a.isRegularFile() && p.toString().endsWith(".txt"))) {
            return stream.parallel()
                    .mapToLong(this::getSize)
                    .sum();
        }
    }

    long getSizeDirectories(Path path) throws IOException {
        try (Stream<Path> stream = Files.walk(path, 0, FileVisitOption.FOLLOW_LINKS)) {
            return stream.parallel()
                    .filter(Files::isDirectory)
                    .mapToLong(this::getSize)
                    .sum();
        }
    }

    long getSizeFiles(Path path) throws IOException {
        try (Stream<Path> stream = Files.walk(path)) {
            return stream.parallel()
                    .filter(Files::isRegularFile)
                    .mapToLong(this::getSize)
                    .sum();
        }
    }

    long getSize(Path path) {
        try {
            return Files.size(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
