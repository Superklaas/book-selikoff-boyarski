package static_data;

public class Penguin {

    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {

        var p1 = new Penguin();
        p1.name = "Klaas";
        p1.nameOfTallestPenguin = "Klaas";

        var p2 = new Penguin();
        p2.name = "Elodie";
        p2.nameOfTallestPenguin = "Elodie";

        System.out.printf("%s, %s%n", p1.name, p1.nameOfTallestPenguin);
        System.out.printf("%s, %s%n", p2.name, p2.nameOfTallestPenguin);

    }

}
