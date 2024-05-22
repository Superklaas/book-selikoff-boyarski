package sorting.tree_set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetOrdering {

    public static void main(String[] args) {
        TreeSet<Rabbit> rabbits = new TreeSet<>(Comparator.comparing(Rabbit::name));
        rabbits.add(new Rabbit("Grand Kallé"));
        rabbits.add(new Rabbit("Papa Wendo"));
        rabbits.add(new Rabbit("Kofi Olomide"));
        rabbits.add(new Rabbit("Papa Wemba"));
        rabbits.add(new Rabbit("Tabu Ley Rochereau"));
        rabbits.add(new Rabbit("Docteur Nico"));
        System.out.println(rabbits);
    }

}


