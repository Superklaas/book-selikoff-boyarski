package polymorphism.instanceof_operator;

public class Main {

    public static void main(String[] args) {

        // avoid ClassCastException by preceding casting to subtype with instanceof operator
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara) {
            Capybara capybara = (Capybara) rodent; // explicit casting instead of pattern matching for example's sake
        }

        // incompatible types: instanceof operator not usable
        /*Bird bird = new Bird();
        if (bird instanceof Fish) {
            System.out.println(bird);
        }*/

    }

}

class Bird {}

class Fish {}

class Rodent {}

class Capybara extends Rodent {}
