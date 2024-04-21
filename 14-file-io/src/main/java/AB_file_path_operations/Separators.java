package AB_file_path_operations;

import java.nio.file.FileSystems;

public class Separators {

    public static void main(String[] args) {

        // file separator
        String fileSeparator = FileSystems.getDefault().getSeparator();
        System.out.println("File separator: " + fileSeparator);

        // line separator
        String lineSeparator = System.lineSeparator()
                .replace("\r", "\\r")
                .replace("\n", "\\n");
        System.out.println("Line separator: " + lineSeparator);

    }

}
