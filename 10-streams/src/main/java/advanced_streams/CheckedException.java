package advanced_streams;

import java.io.IOException;
import java.util.function.Supplier;

/**
 * Lambda expressions (implementations of functional interfaces) do not allow checked exceptions.
 * When method called in lambda expression throws checked exceptions, workaround has to be found.
 */
public class CheckedException {

    public static void main(String[] args) {

        ExceptionCaller exceptionCaller = new ExceptionCaller();

        // workaround 1: catch checked exception in lambda expression (ugly, not concise)
        Supplier<String> supplier1 = () -> {
            try {
                return exceptionCaller.createException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        // workaround 2: catch checked exception in called method & throw unchecked exception instead
        Supplier<String> supplier2 = exceptionCaller::createExceptionSafe;

    }

}

class ExceptionCaller {

    String createException() throws IOException {
        throw new IOException();
    }

    String createExceptionSafe() {
        try {
            return createException();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

}
