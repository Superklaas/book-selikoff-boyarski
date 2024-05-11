package generics.generic_interfaces;

class ShippableItem2<U> implements Shippable<U> {
    @Override
    public void ship(U u) {
    }
}
