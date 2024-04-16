package file_path_operations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileIO {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\1014364\\IdeaProjects\\OCP Java 17\\book-selikoff-boyarski\\14-file-io\\src\\main\\resources\\test.txt");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isAbsolute());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.length());
        System.out.println(file.renameTo(new File("14-file-io/src/main/resources/testje.txt")));
        System.out.println("---------------");

        File parentDirectory = file.getParentFile();
        System.out.println(parentDirectory.getAbsolutePath());
        System.out.println(parentDirectory.isDirectory());
        System.out.println(Arrays.toString(parentDirectory.listFiles()));
        System.out.println(parentDirectory.mkdir());



    }

}
