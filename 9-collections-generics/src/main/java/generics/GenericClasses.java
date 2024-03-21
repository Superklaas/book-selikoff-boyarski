package generics;

public class GenericClasses {

    public static void main(String[] args) {

        Elephant elephant = new Elephant("Dumbo");
        Crate<Elephant> elephantCrate = new Crate<>();
        elephantCrate.setContent(elephant);
        System.out.println(elephantCrate.getContent());

        Robot robot = new Robot("Johan");
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.setContent(robot);
        System.out.println(robotCrate.getContent());

    }

}

class Crate<T> {

    T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}

record Elephant(String name) {}

record Robot(String name) {}
