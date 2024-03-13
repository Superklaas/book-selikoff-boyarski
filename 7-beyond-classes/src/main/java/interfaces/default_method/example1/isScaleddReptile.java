package interfaces.default_method.example1;

public interface isScaleddReptile {

    private static int addNumberOfScales(int a, int b) {
        return a + b;
    }

    default int getNumberOfScales() {
        return addNumberOfScales(1,2);
    }

}
