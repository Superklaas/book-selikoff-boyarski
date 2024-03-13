package polymorphism.override_hide;

public class Main {

    public static void main(String[] args) {

        Pigeon pigeon = new Pigeon();
        Bird bird = pigeon;

        // static method: use implementation reference type
        pigeon.fly();
        bird.fly();

        // instance variable: use implementation reference type
        System.out.println(pigeon.age);
        System.out.println(bird.age);

        // instance method: use implementation object type
        pigeon.talk();
        bird.talk();

    }

}

class Bird {

    int age = 3;

    static void fly() {
        System.out.println("bird flies");
    }

    void talk() {
        System.out.println("bird talks");
    }

}

class Pigeon extends Bird {

    int age = 5;

    static void fly() {
        System.out.println("pigeon flies");
    }

    void talk() {
        System.out.println("pigeon talks");
    }

}


