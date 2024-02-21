package arrays;

import java.util.Arrays;

public class DeclareArrays {

    public static void main(String[] args) {

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals);
        System.out.println(Arrays.toString(mammals));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
