package G_advanced_apis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ModifyingAttributes {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test-directory");

        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        BasicFileAttributes attributes = view.readAttributes();
        System.out.println("Old modification time: " + attributes.lastModifiedTime());

        FileTime newLastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(newLastModifiedTime,null, null);

        attributes = view.readAttributes();
        System.out.println("New modification time: " + attributes.lastModifiedTime());

    }

}
