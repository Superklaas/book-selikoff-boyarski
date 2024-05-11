package review_questions.question10;

import java.util.Map;

public class Question10 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(1, 2, 3, 4);
        System.out.println(map);
        map.forEach((k,v) -> System.out.println(k + "," + v));
    }

}
