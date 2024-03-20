package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        String[] stringArray1 = list.toArray(new String[0]);
        String[] stringArray2 = list.toArray(new String[10]);

        list.clear();

        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray1));
        System.out.println(Arrays.toString(stringArray2));

    }

}
