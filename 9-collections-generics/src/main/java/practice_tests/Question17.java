package practice_tests;

import java.util.TreeSet;

public class Question17 {

    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
        System.out.println(set.size());
        System.out.println(set);
    }

}

record Magazine(String name) implements Comparable<Magazine> {
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
}
