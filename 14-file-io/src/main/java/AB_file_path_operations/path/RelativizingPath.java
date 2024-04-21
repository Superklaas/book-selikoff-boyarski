package AB_file_path_operations.path;

import java.nio.file.Path;

public class RelativizingPath {

    public static void main(String[] args) {

        Path path1 = Path.of("fish.txt");
        Path path2 = Path.of("friendly/birds.txt");

        Path relativize1 = path1.relativize(path2);
        Path relativize2 = path2.relativize(path1);

        System.out.println(relativize1);
        System.out.println(relativize2);

    }

}
