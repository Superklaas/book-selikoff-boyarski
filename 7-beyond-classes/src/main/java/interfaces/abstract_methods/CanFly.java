package interfaces.abstract_methods;

public abstract interface CanFly {

    public static final int KILOMETERS = 100;
//    protected static final int HECTOMETERS = 100;
//    private static final int DECAMETERS = 100;

    public abstract void fly1();
//    protected abstract void fly3();
//    private abstract void fly2();

    public default void hover1() {};
//    protected default void hover2() {};
//    private default void hover3() {};

    public static void trip1() {};
//    protected static void trip2() {};
    private static void trip3() {};

}
