package practice_tests;

public class Question37 {

    public static void main(String[] args) {
        var pen = new Question37();
        pen.length("penguins");
        pen.length(5);
        pen.length(new Object());
    }

    public void length(Object obj) {
        if (obj instanceof String) {
//            System.out.println(obj.length());
        }
    }

}
