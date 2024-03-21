package sorting;

import java.util.ArrayList;
import java.util.List;

public record Duck(String name, int friendliness, String species) implements Comparable<Duck> {

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return name.compareTo(otherDuck.name()); // sort by name ascending
    }

    public static List<Duck> createDuckList() {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Klaas",1, "human"));
        ducks.add(new Duck("Elodie",9, "angel"));
        ducks.add(new Duck("Howard",7, "turtle"));
        ducks.add(new Duck("Sunday",6, "dolphin"));
        ducks.add(new Duck("Augustin",4, "crocodile"));
        ducks.add(new Duck("Pablo",5, "chameleon"));
        return ducks;
    }

}
