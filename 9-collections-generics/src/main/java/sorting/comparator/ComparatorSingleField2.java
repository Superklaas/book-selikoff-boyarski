package sorting.comparator;

import sorting.Duck;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting by custom comparator (friendliness descending).
 * Use lambda expression for implementation Comparator.
 */
public class ComparatorSingleField2 {

    public static void main(String[] args) {
        Comparator<Duck> comparator = (duck1, duck2) -> duck2.friendliness() - duck1.friendliness();
        List<Duck> ducks = Duck.createDuckList();
        Collections.sort(ducks,comparator);
        System.out.println(ducks);
    }

}

