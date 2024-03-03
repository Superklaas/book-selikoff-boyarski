package overloaded_constructor;

/**
 * Class to demonstrate use method this() for constructor overloading
 */
public class Hamster {

    private final int weight;
    private final String color;

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) {
        this(weight,"brown");
    }

    @Override
    public String toString() {
        return "overloaded_constructor.Hamster{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Hamster hamster = new Hamster(10);
        System.out.println(hamster);
    }

}
