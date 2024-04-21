package AB_file_path_operations.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RetrievingRealPath {

    public static void main(String[] args) throws IOException {

        Path realPath = Paths.get(".").toRealPath();
        System.out.println(realPath);

    }

}