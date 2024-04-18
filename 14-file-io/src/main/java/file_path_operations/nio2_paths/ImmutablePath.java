package file_path_operations.nio2_paths;

import java.nio.file.Path;

public class ImmutablePath {

    public static void main(String[] args) {
        Path path = Path.of("whale");
        Path krill = path.resolve("krill");
        System.out.println(path); // whale
        System.out.println(krill);
    }

}
