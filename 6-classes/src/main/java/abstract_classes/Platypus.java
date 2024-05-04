package abstract_classes;

public class Platypus extends Mammal {

    @Override
    void chew() {
        System.out.println("lekker");
    }

    public static void main(String[] args) {
        Mammal platypus = new Platypus();
        platypus.chew();
    }

}
