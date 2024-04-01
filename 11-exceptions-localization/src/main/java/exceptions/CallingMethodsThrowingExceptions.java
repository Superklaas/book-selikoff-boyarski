package exceptions;

public class CallingMethodsThrowingExceptions {

    // declaring exception in method declaration with keyword throws
    public void use() throws NoMoreCarrotsException {
        eat();
    }

    // handling exception with try-catch
    public void consume() {
        try {
            eat();
        } catch (NoMoreCarrotsException e) {
            System.out.println("sad rabbit");
        }
    }

    private static void eat() throws NoMoreCarrotsException {
        System.out.println("eating");
    }

}

class NoMoreCarrotsException extends Exception {}