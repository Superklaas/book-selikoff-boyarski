package reading_writing_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharacterData {

    void copyTextFile(File src, File dest) throws IOException {
        FileReader fileReader = new FileReader(src);
        FileWriter fileWriter = new FileWriter(dest);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        }
    }

}
