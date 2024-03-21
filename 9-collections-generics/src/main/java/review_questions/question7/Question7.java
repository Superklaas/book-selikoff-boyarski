package review_questions.question7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
}

abstract class Alpaca {
    public List<String> hairy(List<String> list) {
        return null;
    }
}

class BabyAlpaca extends Alpaca {
    public ArrayList<String> hairy(List<String> list) {
        return null;
    }
}

class MotherAlpaca extends Alpaca {
//    @Override
    public List<String> hairy(ArrayList<String> list) {
        return null;
    }
}


