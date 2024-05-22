package practice_exam1;

public class Question43 {

    public static void main(String[] bubbles) throws Exception {
        final var v = (Fish)new Clownfish();
//        Clownfish f = v;
//        f.getFish();
        System.out.println("swim!");
    }

}

class BubbleException extends Exception {
}

abstract class Fish {
    Fish getFish() {
        throw new RuntimeException("fish!");
    }
}

final class Clownfish extends Fish {
//    public final Clownfish getFish() throws BubbleException {
    public final Clownfish getFish() {
        throw new RuntimeException("clown!");
    }
}


