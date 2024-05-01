public class NumericConversion {

    public static void main(String[] args) {

        System.out.println(Double.parseDouble("1234"));

        Double value = Double.valueOf(1234.1234);
        System.out.println(value.intValue());
        System.out.println(value.doubleValue());
        System.out.println(value.byteValue());

    }

}
