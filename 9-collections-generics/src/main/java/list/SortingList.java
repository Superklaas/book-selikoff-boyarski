package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingList {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        System.out.println(people);

        people.sort(Comparator.comparingInt(o -> o.age));

        System.out.println("After sorting:");
        System.out.println(people);

    }

}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
