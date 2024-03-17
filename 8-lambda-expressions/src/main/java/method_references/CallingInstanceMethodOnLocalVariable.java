package method_references;

public class CallingInstanceMethodOnLocalVariable {

    interface StringStart {
        boolean beginningCheck(String prefix);
    }

    void stringChecker(String prefix) {
        String string = "klaas";
        StringStart stringStart = string::startsWith;
        System.out.println(stringStart.beginningCheck(prefix));
    }

    public static void main(String[] args) {
        new CallingInstanceMethodOnLocalVariable().stringChecker("elodie");
        new CallingInstanceMethodOnLocalVariable().stringChecker("k");
    }


}
