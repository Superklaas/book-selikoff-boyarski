package H_review_questions;

import java.io.IOException;
import java.io.Writer;

public class Question3 {

    public static void main(String[] args) throws IOException {
        String line;
        var c = System.console();
        Writer w = c.writer();
        try (w) {
            if ((line = c.readLine("Enter your name: ")) != null) {
                w.append(line);
            }
            w.flush();
        }
    }

}
