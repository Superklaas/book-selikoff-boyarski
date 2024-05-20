package F_user_interaction;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReadingConsoleData {

    public static void main(String[] args) throws IOException {

        Console console = System.console();

        // read data with console.reader() & wrap into BufferedReader
        if (console != null) {
            Reader reader = console.reader();
            BufferedReader bufferedReader = new BufferedReader(reader);
            try (bufferedReader) {
                String userInput = bufferedReader.readLine();
                console.writer().println("You entered: " + userInput);
            }
        } else {
            System.err.println("Console not available");
        }

        // read data with console.readLine()
        if (console != null) {
            String userInput = console.readLine("Enter your name: ");
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }

        // read sensitive data with console.readPassword()
        if (console != null) {
            char[] userInput = console.readPassword("Enter your password: ");
            console.writer().println("You entered: " + Arrays.toString(userInput));
        } else {
            System.err.println("Console not available");
        }

    }

}
