package chapter3.question12;

public class Dinosaur {
    class Pterodactyl extends Dinosaur {}
    public void roar() {
        var dino = new Dinosaur();
        new Dinosaur.Pterodactyl();
    }
}

