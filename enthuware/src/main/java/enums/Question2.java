package enums;

public class Question2 {
}

enum Pets {
    DOG("D"), CAT("C"), FISH("F");
    static String prefix = "I am ";
    String name;

    Pets(String s) {
//        name = prefix + s;
    }

    public String getData() {
        return name;
    }
}
