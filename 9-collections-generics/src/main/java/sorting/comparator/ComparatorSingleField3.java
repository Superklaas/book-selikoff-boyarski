package sorting.comparator;

import sorting.Duck;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by custom comparator (friendliness descending).
 * Use method reference & helper methods for implementation Comparator.
 */
public class ComparatorSingleField3 {

    public static void main(String[] args) {
        Comparator<Duck> comparator = Comparator.comparing(Duck::friendliness).reversed();
        List<Duck> ducks = Duck.createDuckList();
        Collections.sort(ducks,comparator);
        System.out.println(ducks);
    }

}

