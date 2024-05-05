package polymorphism.member_accessibility;

import java.util.Collections;
import java.util.List;

public class Lemur extends Primate implements HasTail {

    int age;

    @Override
    public boolean isTailStriped() {
        return true;
    }

}
