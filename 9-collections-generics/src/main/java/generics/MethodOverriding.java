package generics;

import java.util.ArrayList;
import java.util.List;

public class MethodOverriding {

}

class Mammal {
    List<CharSequence> play() {
        return null;
    }
    CharSequence sleep() {
        return null;
    }
}

class Monkey extends Mammal {
    ArrayList<CharSequence> play() {
        return null;
    }
}

class Zebra extends Mammal {
//    List<String> play() {
//        return null;
//    }
}
