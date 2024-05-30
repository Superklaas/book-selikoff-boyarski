package interfaces;

public class Question5 implements T1, T2 {

    public void m1() {
    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.m1();
        System.out.println(((T1) question5).VALUE);
        System.out.println(((T2) question5).VALUE);
    }

}

interface T1 {
    int VALUE = 1;

    void m1();
}

interface T2 {
    int VALUE = 2;

    void m1();
}
