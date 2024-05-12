package intermediate_operations;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEx2 {

    public static void main(String[] args) {

        List<String> letters = List.of("a", "b", "c");
        List<Integer> numbers = List.of(1, 2, 3);

        List<? extends Serializable> list = Stream.of(letters, numbers)
                .flatMap(Collection::parallelStream)
                .toList();

        System.out.println(list);
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(4).getClass());

    }

}
