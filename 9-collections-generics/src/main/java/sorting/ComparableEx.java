package sorting;

import java.util.Collections;
import java.util.List;

/**
 * Sorting by natural order (name) defined in record Duck.
 */
public class ComparableEx {

    public static void main(String[] args) {
        List<Duck> ducks = Duck.createDuckList();
        Collections.sort(ducks);
        System.out.println(ducks);
    }

}

