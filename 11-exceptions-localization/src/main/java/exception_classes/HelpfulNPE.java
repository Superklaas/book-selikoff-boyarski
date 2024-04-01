package exception_classes;

public class HelpfulNPE {

    public static void main(String[] args) {
        Dog dog = new Dog(null);
        Frog frog = new Frog(null);
    }

}

class Dog {

    String name;

    public Dog(String name) {
        this.name = name.toLowerCase();
    }

}

record Frog(String name, int age) {

    public Frog(String name) {
        this(name.toLowerCase(),3);
    }

}
