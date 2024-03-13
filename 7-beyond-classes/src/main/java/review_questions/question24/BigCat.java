package review_questions.question24;

public interface BigCat {
    abstract String getName();
//    static int hunt() { getName(); return 5; }
    default void climb() { rest(); }
//    private void roar() { getName();  climb(); hunt(); }
//    private static boolean sneak() { roar(); return true; }
    private int rest() { return 2; };
}
