package nested_classes.inner_classes.example1;

public class Home {

    private final String greeting;

    public Home(String greeting) {
        this.greeting = greeting;
    }

    public void enterRoom() {
        Room room = new Bedroom();
        room.sayHi();
    }

    final class Bedroom extends Room {

        private static final int REPETITION = 3;

        void sayHi() {
            for (int i = 0; i < REPETITION; i++) {
                greet(greeting);
            }
        }

        private static void greet(String greeting) {
            System.out.println(greeting);
        }

    }

    abstract class Room {

        abstract void sayHi();

    }

}


