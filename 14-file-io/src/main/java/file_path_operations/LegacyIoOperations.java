package file_path_operations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class LegacyIoOperations {

    public static void main(String[] args) throws IOException {

        File nonExistentFile = new File("home");
        System.out.println("File exists: " + nonExistentFile.exists());
        System.out.println("Is file: " + nonExistentFile.isFile());
        System.out.println("---------------");

        File file = new File("test-directory\\test.txt");
        System.out.println("Relative file name: " + file.getName());
        System.out.println("Parent directory: " + file.getParent());
        System.out.println("Is absolute path: " + file.isAbsolute());
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Last modified: " + new Date(file.lastModified()));
        System.out.println("Number of bytes in file: " + file.length());
//        System.out.println(file.renameTo(new File("testje.txt")));
        System.out.println("---------------");

        File parentDirectory = file.getParentFile();
        System.out.println("Parent directory absolute: " + parentDirectory.getAbsolutePath());
        System.out.println("Parent directory relative: " + parentDirectory.getName());
        System.out.println("Is directory: " + parentDirectory.isDirectory());
        System.out.println("Content parent directory: " + Arrays.toString(parentDirectory.listFiles()));

    }

}
