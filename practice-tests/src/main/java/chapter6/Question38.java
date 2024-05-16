package chapter6;

import java.util.List;

public class Question38 {

    public static void main(String[] args) {

        var list = List.of('a', 'b', 'c');

        list.stream()
                .sorted()
                .findAny()
                .ifPresent(System.out::println);

        System.out.println(list.stream()
                .sorted()
                .findFirst());

    }


}
