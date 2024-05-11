package review_questions.question3;

import java.util.ArrayDeque;

public class Question3 {

    public static void main(String[] args) {
        var greetings = new ArrayDeque<String>();
        greetings.offerLast("hello");
        greetings.offerLast("hi");
        greetings.offerFirst("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.print(greetings.pop());
        }
    }

}
