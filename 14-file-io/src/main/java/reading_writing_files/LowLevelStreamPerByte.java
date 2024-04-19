package reading_writing_files;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class LowLevelStreamPerByte {

    /**
     * Byte data: InputStream & OutputStream.
     * Use no-args methods read() and write().
     */
    void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    /**
     * Character data: Reader & Writer.
     * Use no-args methods read() and write().
     */
    void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

}
