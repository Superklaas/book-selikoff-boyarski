package interfaces.default_method.example2;

/**
 * Possibility to call abstract, private & static methods in default method.
 */
public interface ZooRenovation {

    String status();

    static String projectName() {
        return "zoo renovation";
    }

    private String budget() {
        return "€300";
    }

    default void printStatus() {
        System.out.printf("Project %s with status %s and budget %s", projectName(), status(), budget());
    }

}
