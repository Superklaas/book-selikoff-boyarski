package arrays;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {
        int[] numbers = {3,2,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 0));
    }

}
