package H_review_questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question17 {

    public static void main(String[] args) throws IOException {
        Question17 question17 = new Question17();
        question17.echo();
    }

    private void echo() throws IOException {
        var o = new FileWriter("test-directory/new-zoo.txt");
        try (var f = new FileReader("test-directory/zoo-data.txt");
             var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write("");
    }

}
