package sorting;

import java.util.Comparator;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {
        List<Duck> duckList = Duck.createDuckList();
        duckList.sort(Comparator.comparing(Duck::friendliness).reversed());
        System.out.println(duckList);
    }

}
