package CD_reading_writing_files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedBinaryData {

    public static void main(String[] args) throws IOException {
        BufferedBinaryData main = new BufferedBinaryData();
        File input = new File("test-directory/test.txt");
        File output = new File("test-directory/test-output.txt");
        main.copyTextFile(input, output);
    }

    void copyTextFile(File src, File dest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(dest, true);
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            byte[] allBytes = bufferedInputStream.readAllBytes();
            System.out.println(Arrays.toString(allBytes));
            bufferedOutputStream.write(allBytes);
        }
    }


}
