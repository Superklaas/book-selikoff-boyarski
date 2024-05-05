package interfaces.default_method.example1;

public interface IsScaleddReptile {

    private static int addNumberOfScales(int a, int b) {
        return a + b;
    }

    default int getNumberOfScales() {
        return IsScaleddReptile.addNumberOfScales(1,2);
    }

}
