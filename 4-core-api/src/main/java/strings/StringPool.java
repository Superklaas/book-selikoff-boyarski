package strings;

public class StringPool {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);

        var z = " Hello World".trim();
        System.out.println(x == z);

    }

}
