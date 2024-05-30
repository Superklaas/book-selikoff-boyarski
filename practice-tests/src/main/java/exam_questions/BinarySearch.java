package exam_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int e1 = 5;
        int e2 = 2;
        int e3 = 7;

        // correct index is found, not sure why. we didn't sort the list?
        List<Integer> list = new ArrayList<>(Arrays.asList(e1, e3, e2));
        System.out.println(Collections.binarySearch(list, e3));

        // collection sorted natural order, index found
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, e3));

        // collection sorted reverse order, index not found
        // works if we add 3d parameter Comparator.reverseOrder() to Collections.binarySearch
        Collections.reverse(list);
        System.out.println(Collections.binarySearch(list, e3));
        System.out.println(Collections.binarySearch(list, e3, Comparator.reverseOrder()));

    }

}
