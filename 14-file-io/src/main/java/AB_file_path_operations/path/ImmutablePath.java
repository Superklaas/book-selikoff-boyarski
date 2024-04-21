package AB_file_path_operations.path;

import java.nio.file.Path;

public class ImmutablePath {

    public static void main(String[] args) {
        Path path = Path.of("whale");
        Path krill = path.resolve("krill");
        System.out.println(path); // whale
        System.out.println(krill);
    }

}
