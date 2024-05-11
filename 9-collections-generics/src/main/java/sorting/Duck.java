package sorting;

import java.util.ArrayList;
import java.util.List;

public record Duck(String name, int friendliness, String species) implements Comparable<Duck> {

    @Override
    public String toString() {
        return name;
    }

    /**
     * Sort by name ascending.
     * Use implementation of method compareTo() in String.class.
     */
    @Override
    public int compareTo(Duck otherDuck) {
        if (otherDuck == null) throw new IllegalArgumentException("OtherDuck cannot be null");
        if (this.name == null && otherDuck.name == null) return 0;
        else if (this.name == null) return -1;
        else if (otherDuck.name == null) return 1;
        else return name.compareTo(otherDuck.name());
    }

    public static List<Duck> createDuckList() {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Klaas", 1, "human"));
        ducks.add(new Duck("Elodie", 9, "angel"));
        ducks.add(new Duck("Howard", 7, "turtle"));
        ducks.add(new Duck("Sunday", 6, "dolphin"));
        ducks.add(new Duck("Augustin", 4, "crocodile"));
        ducks.add(new Duck("Pablo", 5, "chameleon"));
        return ducks;
    }

}
