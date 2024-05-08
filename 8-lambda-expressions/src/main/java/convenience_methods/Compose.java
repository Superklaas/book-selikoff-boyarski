package convenience_methods;

import java.util.function.Function;

public class Compose {

    public static void main(String[] args) {

        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> doubleUp = x -> x * 2;

        Function<Integer, Integer> doubleUpAndAddOne = addOne.compose(doubleUp);

        Integer result = doubleUpAndAddOne.apply(3);

        System.out.println(result);

    }

}
