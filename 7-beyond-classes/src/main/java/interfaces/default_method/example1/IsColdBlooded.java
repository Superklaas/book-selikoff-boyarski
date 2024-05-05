package interfaces.default_method.example1;

public interface IsColdBlooded {

    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }

    default int getNumberOfScales() {
        return 20;
    }

}
