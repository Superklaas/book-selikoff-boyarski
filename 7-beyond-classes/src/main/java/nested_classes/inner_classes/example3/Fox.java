package nested_classes.inner_classes.example3;

public class Fox {

    class Den {}

    public void instanceMethod() {
        new Den();
    }

    public static void staticMethod() {
        new Fox().new Den();
    }

}

class Squirrel {

    public void instanceMethod() {
        new Fox().new Den();
    }

}
