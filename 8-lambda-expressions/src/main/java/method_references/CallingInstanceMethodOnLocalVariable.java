package method_references;

public class CallingInstanceMethodOnLocalVariable {

    interface StringStart {
        boolean beginningCheck(String prefix);
    }

    void stringChecker(String string, String prefix) {
        StringStart stringStart = string::startsWith;
        System.out.println(stringStart.beginningCheck(prefix));
    }

    void stringChecker_AC(String string, String prefix) {
        StringStart stringStart = new StringStart() {
            @Override
            public boolean beginningCheck(String prefix) {
                return string.startsWith(prefix);
            }
        };
        System.out.println(stringStart.beginningCheck(prefix));
    }

    public static void main(String[] args) {
        new CallingInstanceMethodOnLocalVariable().stringChecker("elodie","e");
        new CallingInstanceMethodOnLocalVariable().stringChecker("elodietje","klaas");
    }


}
