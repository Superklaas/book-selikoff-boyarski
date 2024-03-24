package advanced_streams;

import java.io.IOException;
import java.util.function.Supplier;

public class CheckedException {

    public static void main(String[] args) {
        ExceptionCaller exceptionCaller = new ExceptionCaller();
        Supplier<String> supplier1 = () -> {
            try {
                return exceptionCaller.createException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
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
