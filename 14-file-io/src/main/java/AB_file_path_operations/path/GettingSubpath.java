package AB_file_path_operations.path;

import java.nio.file.Path;

public class GettingSubpath {

    public static void main(String[] args) {

        Path path = Path.of("/mammal/omnivore/racoon.image");

        System.out.println(path.subpath(0, 3));
        System.out.println(path.subpath(1,3));
        System.out.println(path.subpath(0,1));
        System.out.println(path.subpath(0,4));

    }

}
