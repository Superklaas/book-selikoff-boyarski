package CD_reading_writing_files;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class LowLevelStreamPerByte {

    /**
     * BINARY DATA
     * Read binary data byte per byte from InputStream using no-args method read().
     * Write binary data byte per byte to OutputStream using no-args method write().
     */
    void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    /**
     * CHARACTER DATA
     * Read character data byte per byte from Reader using no-args method read().
     * Write character data byte per byte to OutputStream using no-args method write().
     */
    void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

}
