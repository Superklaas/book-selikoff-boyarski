package review_questions;

public class Question18 {

    public static void main(String[] args) {

        // example review question
        String s = "";
        s += 2;
        s += 'c';
        s += false;
        System.out.println(s);
        System.out.println(s == "2cfalse");

        // similar to example in book
        String rat1 = "r" + "a" + "t" + 1;
        String rat2 = "";
        rat2 += "r";
        rat2 += "a";
        rat2 += "t";
        rat2 += 1;
        System.out.println("rat1" == rat1); // true
        System.out.println("rat1" == rat2); // false

    }

}
