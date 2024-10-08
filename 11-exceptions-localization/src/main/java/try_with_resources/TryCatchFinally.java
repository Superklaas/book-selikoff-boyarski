package try_with_resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryCatchFinally {

    public void readFile() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");
            outputStream = new FileOutputStream("output.txt");
            // read data from inputStream
            // write data to outputStream
        } catch (IOException e) {
            // handling exception
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                assert outputStream != null;
                outputStream.close();
            } catch (IOException e) {
                // handling exception
            }
        }
    }


}
