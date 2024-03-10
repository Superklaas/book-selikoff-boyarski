package encapsulation;

public class Main {

    public static void main(String[] args) {

        EncapsulatedCrane elodie = new EncapsulatedCrane(108, "Elodie");
        System.out.println(elodie);
        elodie.setNumberEggs(111);
        elodie.setName("Cherie");
        System.out.println(elodie);

        try {
            EncapsulatedCrane nameless = new EncapsulatedCrane(-1, "Nameless");
            System.out.println(nameless);
        } catch (IllegalArgumentException e) {
            // \u001B[32m is the ANSI escape code for setting the text color to green
            // \u001B[0m resets the text color back to the default
            System.out.printf("\u001B[32mException: %s\u001B[0m%n", e.getMessage());
        }

        ImmutableCrane confucius = new ImmutableCrane(0, "Confucius");
        System.out.println(confucius);

        // not possible to modify immutable object confucius
        // copy over properties from original object into new object & make modifications in constructor arguments
        ImmutableCrane confuciusClone = new ImmutableCrane(confucius.getNumberEggs() - 1, confucius.getName());
        System.out.println(confuciusClone);

    }

}
