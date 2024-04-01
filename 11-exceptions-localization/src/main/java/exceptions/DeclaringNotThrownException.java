package exceptions;

import java.io.FileNotFoundException;

public class DeclaringNotThrownException {

    public static void main(String[] args) throws FileNotFoundException {
        printHello();
    }

    static void printHello() throws FileNotFoundException {
        System.out.println("Hello");
    }

}
