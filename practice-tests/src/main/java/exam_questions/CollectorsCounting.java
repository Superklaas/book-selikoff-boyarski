package exam_questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsCounting {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Car", "Car", "Car", "Truck", "Truck", "Airplane");

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length,Collectors.toCollection(LinkedList::new)));
        System.out.println(collect);

    }

}
