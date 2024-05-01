package review_questions;

public class Question8 {

    public static void main(String[] args) {
        int pig = (short)4;
        pig = pig++;
        long goat = (int) 2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);
        if (goat == 1L) {
            System.out.println("goat is long");
        } else {
            System.out.println("goat is double");
        }

    }

}
