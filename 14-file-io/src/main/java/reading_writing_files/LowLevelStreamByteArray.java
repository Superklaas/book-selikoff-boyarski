package reading_writing_files;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class LowLevelStreamByteArray {

    /**
     * I/O streams to read and write byte data: InputStream & OutputStream.
     * Method read(byte[] buffer, int offset, int len) to read len bytes from input stream to buffer, starting from index offset.
     * Method write(byte[] buffer, int offset, int len) to write len bytes from buffer to output stream, starting from index offset.
     * Method flush() to write accumulated data immediately to disk, memory cost notwithstanding.
     */
    void copyStream(InputStream in, OutputStream out) throws IOException {
        int batchSize = 1024;
        byte[] buffer = new byte[batchSize];
        int lengthRead = in.read(buffer, 0, batchSize);
        while (lengthRead > 0) {
            out.write(buffer, 0, lengthRead);
            out.flush();
            lengthRead = in.read(buffer, 0, batchSize);
        }
    }

    /**
     * I/O streams to read and write character data: Reader & Writer.
     * Method read(char[] buffer, int offset, int len) to read len bytes from input stream to buffer, starting from index offset.
     * Method write(char[] buffer, int offset, int len) to write len bytes from buffer to output stream, starting from index offset.
     * Method flush() to write accumulated data immediately to disk, memory cost notwithstanding.
     */
    void copyStream(Reader in, Writer out) throws IOException {
        int batchSize = 1024;
        char[] buffer = new char[batchSize];
        int lengthRead = in.read(buffer, 0, batchSize);
        while (lengthRead > 0) {
            out.write(buffer, 0, lengthRead);
            out.flush();
            lengthRead = in.read(buffer, 0, batchSize);
        }
    }

}
