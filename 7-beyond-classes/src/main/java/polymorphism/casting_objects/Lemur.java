package polymorphism.casting_objects;

import java.util.Collections;
import java.util.List;

public class Lemur extends Primate implements HasTail {

    int age;

    @Override
    public boolean isTailStriped() {
        return true;
    }

    public void sortAndPrintZooAnimals(List<String> animals) {
        Collections.sort(animals);
        animals.forEach(System.out::println);
    }

}
