public class Underflow {
    public static void main(String[] args) {
        byte minValue = Byte.MIN_VALUE;
        byte result = (byte) (minValue - 10);
        System.out.println(minValue);
        System.out.println(result);
    }
}
