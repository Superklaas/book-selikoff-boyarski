package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {

    public void helpBirdSwim() {
        Bird bird = new Goose();
//        bird.floatingInWater();
//        System.out.println(bird.text);
    }

    public void helpGooseSwim() {
        Goose goose = new Goose();
        goose.floatingInWater();
        System.out.println(goose.text);
    }

}


