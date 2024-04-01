package try_with_resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

    public void readFile() throws IOException {
        try (var inputStream = new FileInputStream("test.txt");
             var outputStream = new FileOutputStream("output.txt")) {
            // read data from inputStream
            // write data to outputStream
        }
    }

}
