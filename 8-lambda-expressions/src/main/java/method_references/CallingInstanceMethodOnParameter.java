package method_references;

public class CallingInstanceMethodOnParameter {

    interface BlankParameterChecker {
        boolean check(String s);
    }

    void check(String s) {
//        BlankParameterChecker blankParameterChecker = new BlankParameterChecker() {
//            @Override
//            public boolean check(String s) {
//                return s.isBlank();
//            }
//        };
//        BlankParameterChecker blankParameterChecker = string -> string.isBlank();
        BlankParameterChecker blankParameterChecker = String::isBlank;
        System.out.println(blankParameterChecker.check(s));
    }

    public static void main(String[] args) {
        new CallingInstanceMethodOnParameter().check(" ");
    }

}
