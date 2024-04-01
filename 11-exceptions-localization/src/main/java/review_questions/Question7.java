package review_questions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question7 {

    public void tryAgain(String s) {
        try (FileReader r = null; FileReader p = new FileReader("")) {
            System.out.print("X");
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.print("A");
//            throw new FileNotFoundException();
        } finally {
            System.out.print("O");
        }
    }

}
