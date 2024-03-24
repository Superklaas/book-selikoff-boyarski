package advanced_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UnderlyingData {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("panda");
        Stream<String> stream = list.stream();
        list.add("bear");
        System.out.println(stream.count()); // 2
    }

}
