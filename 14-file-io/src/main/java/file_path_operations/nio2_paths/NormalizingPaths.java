package file_path_operations.nio2_paths;

import java.nio.file.Path;

public class NormalizingPaths {

    public static void main(String[] args) {

        Path path1 = Path.of("/cats/../panther/food");
        Path normalizedPath1 = path1.normalize();
        System.out.println(normalizedPath1);

        Path path2 = Path.of("../../panther/food");
        Path normalizedPath2 = path2.normalize();
        System.out.println(normalizedPath2);

    }

}
