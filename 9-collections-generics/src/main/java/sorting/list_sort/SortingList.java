package sorting.list_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {

        List<String> friends = new ArrayList<>();
        friends.add("Lex Fridman");
        friends.add("Leo Tindemans");
        friends.add("Leopold III");
        friends.add("Leki");
        friends.add("Leemans Mevrouw");

//        friends.sort(String::compareTo); // method reference calling compareTo method in String.class
        friends.sort(Comparator.naturalOrder()); // helper method sorting list using natural order Strings cf. ASCII table

        System.out.println(friends);

    }

}
