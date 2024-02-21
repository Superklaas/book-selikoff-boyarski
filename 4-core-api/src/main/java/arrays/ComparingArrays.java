package arrays;

import java.util.Arrays;

public class ComparingArrays {

    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,2};

        System.out.println(Arrays.equals(array1,array2)); //true
        System.out.println(Arrays.compare(array1,array2)); //0
        System.out.println(Arrays.mismatch(array1,array2)); //-1

        System.out.println(Arrays.equals(array1,array3)); //false
        System.out.println(Arrays.compare(array1,array3)); //positive number
        System.out.println(Arrays.mismatch(array1,array3)); //2

    }

}
