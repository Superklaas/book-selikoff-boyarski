package generics.generic_classes;

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

