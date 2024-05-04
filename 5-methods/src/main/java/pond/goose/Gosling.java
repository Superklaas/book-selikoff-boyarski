package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floatingInWater(); // protected method from Bird
        System.out.print(text); // protected field from Bird
    }

    public static void main(String[] args) {
        Gosling gosling = new Gosling();
        gosling.swim();
    }

}
