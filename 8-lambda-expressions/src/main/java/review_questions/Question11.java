package review_questions;

import java.util.function.Predicate;

public class Question11 {

    static void scary(String animal) {
        Predicate<String> dino = "dino"::equals;
        Predicate<String> dragon = "dragon"::equals;
        Predicate<String> combined = dino.or(dragon);
        System.out.println("test " + animal + ": " + combined.test(animal));
    }

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }

}
