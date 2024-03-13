package nested_classes.anonymous_classes;

public class ZooGiftShopInterface {

    interface ReductionToday {
        int dollarsOff();
    }

    public int calculatePriceWithReduction(int basePrice) {
        ReductionToday reductionToday = new ReductionToday() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - reductionToday.dollarsOff();
    }

}

class Main {

    public static void main(String[] args) {
        ZooGiftShopInterface zooGiftShop = new ZooGiftShopInterface();
        int priceWithReduction = zooGiftShop.calculatePriceWithReduction(200);
        System.out.println(priceWithReduction);
    }

}
