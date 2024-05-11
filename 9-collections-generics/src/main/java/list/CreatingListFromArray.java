package list;

import java.util.Arrays;
import java.util.List;

/**
 * List created from array with Arrays.asList(array), points to same object as array.
 */
public class CreatingListFromArray {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        array[0] = "z";
        System.out.println(list); // zbc

        list.set(0,"y");
        System.out.println(Arrays.toString(array)); // ybc

    }

}
