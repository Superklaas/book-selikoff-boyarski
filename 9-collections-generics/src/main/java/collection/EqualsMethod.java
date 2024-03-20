package collection;

import java.util.List;
import java.util.Set;

public class EqualsMethod {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2);
        System.out.println(list.equals(List.of(1, 2)));
        System.out.println(list.equals(List.of(2,1)));

        Set<Integer> set = Set.of(1,2);
        System.out.println(set.equals(Set.of(1,2)));
        System.out.println(set.equals(Set.of(2,1)));

    }

}
