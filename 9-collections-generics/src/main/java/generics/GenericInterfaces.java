package generics;

public class GenericInterfaces {
}

interface Shippable<T> {
    void ship(T t);
}

class ShippableItem1 implements Shippable<String> {
    @Override
    public void ship(String s) {}
}

class ShippableItem2<U> implements Shippable<U> {
    @Override
    public void ship(U u) {}
}

class ShippableItem3 implements Shippable {
    @Override
    public void ship(Object o) {}
}


