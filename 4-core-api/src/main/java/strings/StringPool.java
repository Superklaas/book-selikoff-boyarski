package strings;

public class StringPool {

    public static void main(String[] args) {

        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y);
        System.out.println("----------");

        var z = " Hello World".trim();
        System.out.println(x == z);
        System.out.println("----------");

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + 1;
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());

    }

}
