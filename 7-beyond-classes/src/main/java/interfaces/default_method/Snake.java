package interfaces.default_method;

public class Snake implements isColdBlooded {

    @Override
    public boolean hasScales() {
        return true;
    }

    @Override
    public double getTemperature() {
        return 12.0;
//        return isColdBlooded.super.getTemperature();
    }
}
