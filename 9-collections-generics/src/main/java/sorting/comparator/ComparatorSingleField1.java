package sorting.comparator;

import sorting.Duck;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by custom comparator (friendliness descending).
 * Use anonymous class for implementation Comparator.
 */
public class ComparatorSingleField1 {

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

