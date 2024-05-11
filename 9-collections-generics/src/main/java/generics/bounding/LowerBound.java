package generics.bounding;

import java.util.List;

public class LowerBound {

    public static void main(String[] args) {

        List<Object> objects = List.of(3, "augustin");
        process(objects);

        List<Number> numbers = List.of(1,2.0,3.0f);
        process(numbers);

        List<Integer> integers = List.of(1, 2, 3);
//        process(integers);

        List<Double> doubles = List.of(1.0, 2.0, 3.0);
//        process(doubles);

        List<String> strings = List.of("klaas", "elodie", "sunday");
//        process(strings);

    }

    /**
     * Elements in list parameter should be superclass of Number.
     */
    static void process(List<? super Number> list) {
        list.forEach(element -> System.out.print(element.toString() + " "));
    }

}
