package terminal_operations;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {

        // public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
        TreeSet<Integer> treeSet1 = Stream.of(1, 2, 5, 4, 7, 5, 2).collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(treeSet1);

        // public <R,A> R collect(Collector<? super T, A,R> collector)
        TreeSet<Integer> treeSet2 = Stream.of(1, 2, 5, 4, 7, 5, 2).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet2);

    }

}
