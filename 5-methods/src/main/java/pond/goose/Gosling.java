package pond.goose;

import pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {
        floatingInWater();
        System.out.print(text);
    }

    public static void main(String[] args) {
        Gosling gosling = new Gosling();
        gosling.swim();
    }

}
