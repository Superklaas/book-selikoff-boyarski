package polymorphism.casting_objects;

public class Main {

    public static void main(String[] args) {
        Primate primate = new Primate();
        Lemur lemur = (Lemur) primate;
        Primate primate1 = lemur;
//        Elephant elephant = lemur;
    }

}
