package enums.example1;

public enum OnlyOne {

    ONCE(true);

    private final boolean truth;

    private OnlyOne(boolean truth) {
        this.truth = truth;
        System.out.println("constructing");
    }

}
