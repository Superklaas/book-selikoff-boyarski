package interfaces.default_method;

public interface isColdBlooded {

    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }

}
