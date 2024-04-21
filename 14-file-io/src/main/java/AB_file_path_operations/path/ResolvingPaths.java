package AB_file_path_operations.path;

import java.nio.file.Path;

public class ResolvingPaths {

    public static void main(String[] args) {

        Path absoluteBasePath = Path.of("/person/../klaas");
        Path relativeBasePath = Path.of("./person/../klaas");

        Path absoluteAppendPath = Path.of("/sunday");
        Path relativeAppendPath = Path.of("sunday");

        System.out.println(relativeBasePath.resolve(relativeAppendPath));
        System.out.println(absoluteBasePath.resolve(relativeAppendPath));
        System.out.println(absoluteBasePath.resolve(absoluteAppendPath));

    }

}
