package sorting.binary_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 8, 9, 1, 4);
        list.sort((i1, i2) -> i2 - i1);
        int result = Collections.binarySearch(list, 88, (i1, i2) -> i2 - i1);
        System.out.println(result);
    }

}
