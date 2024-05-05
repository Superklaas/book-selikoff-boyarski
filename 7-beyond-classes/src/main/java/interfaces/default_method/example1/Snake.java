package interfaces.default_method.example1;

public class Snake implements IsColdBlooded, IsScaleddReptile {

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
        return IsScaleddReptile.super.getNumberOfScales();
    }

}
