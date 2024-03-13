package nested_classes.local_classes;

public class PrintNumbers {

    private final int length;

    public PrintNumbers(int length) {
        this.length = length;
    }

    public void calculate(int width) {
        class Calculator {
            void multiply() {
//                System.out.println(width * length);
            }
        }
        new Calculator().multiply();
        width = 2;
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers(5);
        printNumbers.calculate(20);
    }

}
