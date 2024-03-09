package interfaces.default_method;

public class Snake implements isColdBlooded, isScaleddReptile {

    @Override
    public boolean hasScales() {
        return true;
    }

    @Override
    public double getTemperature() {
        return 12.0;
    }

    @Override
    public int getNumberOfScales() {
        return isScaleddReptile.super.getNumberOfScales();
    }

}
