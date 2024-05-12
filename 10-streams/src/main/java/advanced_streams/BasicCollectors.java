package advanced_streams;

import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicCollectors {

    public static void main(String[] args) {

        // averageDouble
        Double averageDouble = getDoubleStream().collect(Collectors.averagingDouble(n -> n / 2));
        System.out.println(averageDouble);

        // averageInt
        Double averageInt = getIntegerStream().collect(Collectors.averagingInt(n -> n * 3));
        System.out.println(averageInt);

        // counting
        Long count = getIntegerStream().collect(Collectors.counting());
        System.out.println(count);

        // groupingBy: making map according to function
        Map<Integer, List<String>> mapGroupedByStringLength =
                getStringStream().collect(Collectors.groupingBy(String::length));
        System.out.println(mapGroupedByStringLength);

        // joining
        String joinedString = getStringStream().collect(Collectors.joining(""));
        System.out.println(joinedString);

        // equivalent using String.join
        String joinedString2 = String.join("", "Klaas", "Elodie", "Sunday", "Augustin");
        System.out.println(joinedString2);

        // maxBy
        Optional<String> longestString = getStringStream().collect(Collectors.maxBy((a,b) -> a.length() - b.length()));
        longestString.ifPresent(System.out::println);

        // mapping: map().count()
        String mapping = getIntegerStream().collect(Collectors.mapping(n -> "" + n * 2, Collectors.joining(",")));
        System.out.println(mapping);

        // partitioningBy: making map with keys true - false
        Map<Boolean, List<String>> partitioningBy =
                getStringStream().collect(Collectors.partitioningBy(s -> s.length() == 6));
        System.out.println(partitioningBy);

        // summarizingDouble: get summarizing statistics of primitive stream
        IntSummaryStatistics summaryStatistics = getIntegerStream().collect(Collectors.summarizingInt(i -> i * 2));
        System.out.println(summaryStatistics);

        // toCollection: create collection cf. given Supplier
        TreeSet<String> treeSet = getStringStream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
        LinkedList<String> linkedList = getStringStream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

        // toMap: create map according to key & value functions, merge function & mapType supplier
        TreeMap<Integer, String> toMap = getStringStream().collect(Collectors.toMap(
                String::length,
                s -> s,
                (s1, s2) -> "[" + s1 + "," + s2 + "]",
                TreeMap::new));
        System.out.println(toMap);

    }

    private static Stream<Double> getDoubleStream() {
        return Stream.of(1.0, 2.0);
    }

    private static Stream<Integer> getIntegerStream() {
        return Stream.of(1, 2, 3);
    }

    private static Stream<String> getStringStream() {
        return Stream.of("Klaas", "Elodie", "Sunday", "Augustin");
    }


}
