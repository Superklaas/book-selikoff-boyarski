package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingMultipleFields {

    public static void main(String[] args) {
        Comparator<Duck> comparator = Comparator.comparing(Duck::species)
                .thenComparingInt(Duck::friendliness)
                .thenComparing(Duck::name, Comparator.nullsLast(String::compareTo));
        List<Duck> duckList = Duck.createDuckList();
        Collections.sort(duckList, comparator);
        System.out.println(duckList);
    }

}
