package practice_tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Question21 {

    public static void main(String[] args) {
        new Question21().meow(new ArrayList<>());
    }

    public void meow(Collection<String> kitties) {
        if (kitties instanceof List c) {
            System.out.println("L " + c.size());
        } else if (kitties instanceof Map c) {
            c = new TreeMap<>();                  // x1
            System.out.println("M " + c.size());
        } else {
//            System.out.println("E " + c.size());
        }
    }

}
