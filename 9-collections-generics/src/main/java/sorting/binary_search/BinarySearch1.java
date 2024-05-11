package sorting.binary_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 8, 9, 1, 4);
        Collections.sort(list);
        int result = Collections.binarySearch(list, 88);
        System.out.println(result);
    }

}
