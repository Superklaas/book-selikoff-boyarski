package threading_problems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fox {

    private String name;

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void eatAndDrink(Food food, Beverage water) {
        synchronized (food) {
            System.out.println(this.getName() + " eating " + food);
            move();
            synchronized (water) {
                System.out.println(this.getName() + " drinking " + water);
            }
        }
    }

    void drinkAndEat(Beverage water, Food food) {
        synchronized (water) {
            System.out.println(this.getName() + " drinking " + water);
            move();
            synchronized (food) {
                System.out.println(this.getName() + " eating " + food);
            }
        }
    }

    void move() {
        try {
            System.out.println(this.getName() + " moving");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Fox foxy = new Fox("foxy");
        Fox tails = new Fox("tails");
        Food food = new Food("chicken");
        Beverage water = new Beverage("water");
        try {
            executorService.submit(() -> foxy.eatAndDrink(food, water));
            executorService.submit(() -> tails.drinkAndEat(water, food));
        } finally {
            executorService.shutdown();
        }
    }

}

