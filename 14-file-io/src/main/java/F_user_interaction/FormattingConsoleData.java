package F_user_interaction;

import java.io.Console;
import java.io.PrintWriter;

public class FormattingConsoleData {

    public static void main(String[] args) {

        Console console = System.console();

        if (console == null) {
            throw new RuntimeException("console not available");
        } else {
            PrintWriter writer = console.writer();
            try(writer) {
                writer.println("Welcome to zoo");
                console.format("It has %d animals%n", 50);
                writer.format("The CEO is called %s", "Wouter Beke");
            }
        }

    }

}
