package sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetOrdering {

    public static void main(String[] args) {
        TreeSet<Rabbit> rabbits = new TreeSet<>(Comparator.comparing(Rabbit::name).reversed());
        rabbits.add(new Rabbit("Grand Kallé"));
        rabbits.add(new Rabbit("Papa Wendo"));
        rabbits.add(new Rabbit("Kofi Olomide"));
        rabbits.add(new Rabbit("Papa Wemba"));
        rabbits.add(new Rabbit("Tabu Ley Rochereau"));
        System.out.println(rabbits);
    }

}

record Rabbit(String name) {

    @Override
    public String toString() {
        return name;
    }
}


