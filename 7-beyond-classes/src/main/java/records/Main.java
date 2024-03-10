package records;

public class Main {

    public static void main(String[] args) {

        Crane klaas = new Crane(0, "Klaas");
        System.out.println(klaas.toString());
        System.out.println(klaas.name());
        System.out.println(klaas.numberEggs());

        Crane joe = new Crane(0, "Joe");
        System.out.println(joe);
        System.out.println(joe.equals(klaas));
        System.out.printf("%s - %s%n", joe.hashCode(), klaas.hashCode());

        Whale bernie = new Whale(190, "Bernie");
        System.out.println(bernie.length());
        System.out.println(bernie.name());
        System.out.println(bernie);
        System.out.println(bernie.hashCode());

        Shark attila = new Shark(100, "attila");
        System.out.println(attila);
        Shark attila1 = new Shark(100, "ATTILA");
        System.out.println(attila1);

        SwordFish swordFish = new SwordFish("JOHN", "COCKERILL");
        System.out.println(swordFish);

    }

}
