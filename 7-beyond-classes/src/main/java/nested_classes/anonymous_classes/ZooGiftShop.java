package nested_classes.anonymous_classes;

public class ZooGiftShop {

    abstract static class ReductionToday {
        abstract int dollarsOff();
    }

    public int calculatePriceWithReduction(int basePrice) {
        ReductionToday reductionToday = new ReductionToday() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - reductionToday.dollarsOff();
    }

    public static void main(String[] args) {
        ZooGiftShop zooGiftShop = new ZooGiftShop();
        int priceWithReduction = zooGiftShop.calculatePriceWithReduction(200);
        System.out.println(priceWithReduction);
    }

}
