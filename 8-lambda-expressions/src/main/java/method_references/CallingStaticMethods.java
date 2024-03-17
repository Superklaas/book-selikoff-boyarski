package method_references;

public class CallingStaticMethods {

    interface Converter {
        long round(double x);
    }

    void convert(double d) {
        Converter converter = Math::round;
        System.out.println(converter.round(d));
    }

    public static void main(String[] args) {
        new CallingStaticMethods().convert(1.0);
    }

}
