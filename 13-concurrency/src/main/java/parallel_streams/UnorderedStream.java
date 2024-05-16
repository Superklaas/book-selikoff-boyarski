package parallel_streams;

import java.util.ArrayList;
import java.util.List;

public class UnorderedStream {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("---------");

        // findAny: displays any element from list, result impredictible
        list.stream()
                .parallel()
                .findAny()
                .ifPresent(System.out::println);
        System.out.println("---------");

        // findFirst: displays first element 0 in list, treats parallel stream as serial stream
        list.stream()
                .parallel()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("---------");

        // limit: only first two elements 0 and 1 in list, treats parallel stream as serial stream
        list.stream()
                .parallel()
                .limit(2)
                .forEach(System.out::print);
        System.out.println("\n---------");

        // skip: skips first two elements 0 and 1 in list, treats parallel stream as serial stream
        list.stream()
                .parallel()
                .skip(2)
                .forEach(System.out::print);
        System.out.println("\n---------");

        // skip unordered: should skip any two elements from list, not necessarily 0 and 1
        list.stream()
                .parallel()
                .unordered()
                .skip(2)
                .forEach(System.out::print);

    }

}
