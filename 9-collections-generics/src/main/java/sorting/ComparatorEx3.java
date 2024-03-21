package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by custom comparator (friendliness descending).
 * Use method reference & helper method for implementation Comaparator.
 */
public class ComparatorEx3 {

    public static void main(String[] args) {
        Comparator<Duck> comparator = Comparator.comparing(Duck::friendliness);
        List<Duck> ducks = Duck.createDuckList();
        Collections.sort(ducks,comparator);
        System.out.println(ducks);
    }

}

