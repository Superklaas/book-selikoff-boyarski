package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        floatingInWater();
        System.out.println(text);
    }

    public void helpSwanSwim() {
        Swan swan = new Swan();
        swan.floatingInWater();
        System.out.println(swan.text);
    }

    public void helpBirdSwim() {
        Bird bird = new Bird();
//        bird.floatingInWater();
//        System.out.println(bird.text);
    }

}

