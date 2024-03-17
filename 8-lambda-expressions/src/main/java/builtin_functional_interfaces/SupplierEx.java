package builtin_functional_interfaces;

import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "klaas";
        String string = supplier.get();
        System.out.println(string);
    }

}
