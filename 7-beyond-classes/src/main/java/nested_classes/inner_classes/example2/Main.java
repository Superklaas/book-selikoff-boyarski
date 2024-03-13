package nested_classes.inner_classes.example2;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.printX();
    }

}
