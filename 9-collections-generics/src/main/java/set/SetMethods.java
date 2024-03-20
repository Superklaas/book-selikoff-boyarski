package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(1, 2, 3);
        System.out.println(set1);

        Set<Integer> set2 = Set.copyOf(set1);
        System.out.println(set2);

        HashSet<Integer> set3= new HashSet<>();
        set3.add(2);
        set3.add(3);
        set3.add(2);
        set3.add(1);
        System.out.println(set3);

        TreeSet<Integer> set4 = new TreeSet<>(set3);
        System.out.println(set4);

    }

}
