package lambda_expressions;

public class ZooGiftShopInterface {

    interface ReductionToday {
        int dollarsOff();
    }

    public int calculatePriceWithReduction_anonymousClass(int basePrice) {
        ReductionToday reductionToday = new ReductionToday() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - reductionToday.dollarsOff();
    }

    public int calculatePriceWithReduction_lambdaExpression(int basePrice) {
        ReductionToday reductionToday = () -> 3;
        return basePrice - reductionToday.dollarsOff();
    }

    public static void main(String[] args) {

        ZooGiftShopInterface zooGiftShop = new ZooGiftShopInterface();

        // using anonymous class
        int priceWithReduction_anonymousClass = zooGiftShop.calculatePriceWithReduction_anonymousClass(200);
        System.out.println(priceWithReduction_anonymousClass);

        // using lambda expression
        int priceWithReduction_lambdaExpression = zooGiftShop.calculatePriceWithReduction_lambdaExpression(200);
        System.out.println(priceWithReduction_lambdaExpression);

    }

}
