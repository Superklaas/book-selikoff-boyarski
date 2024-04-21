package G_advanced_apis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ReadAttributes {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test-directory");

        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Is directory: " + attributes.isDirectory());
        System.out.println("Creation time: " + attributes.creationTime());
        System.out.println("Size: " + attributes.size() + " bytes");

    }

}
