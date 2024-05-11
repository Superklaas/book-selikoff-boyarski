package sorting.comparator;

import sorting.Duck;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMultipleFields {

    public static void main(String[] args) {
        Comparator<Duck> comparator = Comparator.comparing(Duck::species)
                        .thenComparingInt(Duck::friendliness).reversed()
                        .thenComparing(Duck::name, Comparator.nullsLast(String::compareTo));
        List<Duck> duckList = Duck.createDuckList();
        Collections.sort(duckList, comparator);
        System.out.println(duckList);
    }

}
