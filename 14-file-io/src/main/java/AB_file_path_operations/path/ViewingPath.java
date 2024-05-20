package AB_file_path_operations.path;

import java.nio.file.Path;

public class ViewingPath {

    public static void main(String[] args) {

        // methods for viewing path: toString(), getNameCount(), getName()
        Path path = Path.of("/land/hippo/harry.happy");
        System.out.println("Path name: " + path);
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.printf("Element %d is %s%n", i, path.getName(i));
        }
        System.out.println("------------");

        // root element
        Path root = path.getRoot();
        System.out.println("Path name: " + root);
        System.out.println("Number of elements in path name: " + root.getNameCount());
        System.out.println("-------------");

        // invalid path name indexes
        System.out.println("Path name: " + path);
        for (int i = -1; i < 5; i++) {
            try {
                System.out.println("Path element " + i + ": " + path.getName(i));
            } catch (IllegalArgumentException e) {
                System.out.println("Illegal path name index " + i);
            }
        }

    }

}
