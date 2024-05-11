package generics.bounding;

import java.util.List;

public class UpperBound {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3);
        process(integers);

        List<Double> doubles = List.of(1.0, 2.0, 3.0);
        process(doubles);

        List<String> strings = List.of("klaas", "elodie", "sunday");
//        process(strings);

        List<Object> objects = List.of(3, "augustin");
//        process(objects);

    }

    /**
     * Elements in list parameter should be subclass of Number.
     */
    static void process(List<? extends Number> numbers) {
        numbers.forEach(number -> System.out.print(number + " "));
    }

}
