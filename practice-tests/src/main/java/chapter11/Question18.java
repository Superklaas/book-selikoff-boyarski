package chapter11;

import java.text.NumberFormat;
import java.util.Locale;

public class Question18 {

    public void printReceipt(double t) {
        var formatter = NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT);
        System.out.print(formatter.format(t));
    }

    public static void main(String[] args) {
        Question18 question18 = new Question18();
        question18.printReceipt(123_456.789);
    }

}
