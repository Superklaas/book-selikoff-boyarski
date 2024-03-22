package intermediate_operations;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = list1.stream().map(i -> i * 6).toList();
        List<Integer> list3 = list2.stream().map(i -> i - 17).toList();
        Set<Integer> list = Stream.of(list1, list2, list3)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(list);
    }

}
