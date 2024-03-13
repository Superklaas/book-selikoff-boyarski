package polymorphism.member_accessibility;

public class Main {

    public static void main(String[] args) {

        Lemur lemur = new Lemur();
        int age = lemur.age;
        lemur.isTailStriped();
        lemur.hasHair();

        Primate primate = lemur;
        primate.hasHair();

        HasTail hasTail = lemur;
        hasTail.isTailStriped();

    }

}
