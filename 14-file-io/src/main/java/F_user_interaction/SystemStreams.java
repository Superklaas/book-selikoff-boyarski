package F_user_interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SystemStreams {

    public static void main(String[] args) throws IOException {

        //output stream: System.out & System.err
        System.out.println("hello");
        System.err.println("hello");

        //input stream: System.in
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try(BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String userInput = bufferedReader.readLine();
            System.out.println("You entered: " + userInput);
        }

        //closing System.out
        try (PrintStream out = System.out) {}
        System.out.println("print after closing System.out"); // nothing printed

        //closing System.in
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (bufferedReader) {}
        String inputData = bufferedReader.readLine(); // IOException

    }

}
