package CD_reading_writing_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintCharacterData {

    void copyTextFile(File src, File dest) throws IOException {
        FileReader fileReader = new FileReader(src);
        FileWriter fileWriter = new FileWriter(dest);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                printWriter.println(line);
                line = bufferedReader.readLine();
            }
        }
    }

}
