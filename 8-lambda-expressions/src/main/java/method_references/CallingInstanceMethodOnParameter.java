package method_references;

public class CallingInstanceMethodOnParameter {

    interface BlankParameterChecker {
        boolean check(String s);
    }

    void check(String s) {
        BlankParameterChecker blankParameterChecker = String::isBlank;
        System.out.println(blankParameterChecker.check(s));
    }

    public static void main(String[] args) {
        new CallingInstanceMethodOnParameter().check(" ");
    }

}
