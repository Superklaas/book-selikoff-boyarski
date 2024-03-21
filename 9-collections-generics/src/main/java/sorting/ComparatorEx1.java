package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by custom comparator (friendliness).
 * Use anonymous class for implementation Comaparator.
 */
public class ComparatorEx1 {

    public static void main(String[] args) {
        Comparator<Duck> comparator = new Comparator<>() {
            @Override
            public int compare(Duck duck1, Duck duck2) {
                return duck2.friendliness() - duck1.friendliness();
            }
        };
        List<Duck> ducks = Duck.createDuckList();
        Collections.sort(ducks,comparator);
        System.out.println(ducks);
    }

}

