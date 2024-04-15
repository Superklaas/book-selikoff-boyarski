package threading_problems;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Bear {

    private String name;

    public Bear(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void eatAndDrink(Food food, Beverage water) {
        ReentrantLock lock = new ReentrantLock();
        if (lock.tryLock()) {
            try {
                System.out.println(this.getName() + " eating " + food);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock");
        }
        move();
        if (lock.tryLock()) {
            try {
                System.out.println(this.getName() + " drinking " + water);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock");
        }
    }

    void drinkAndEat(Beverage water, Food food) {
        ReentrantLock lock = new ReentrantLock();
        if (lock.tryLock()) {
            try {
                System.out.println(this.getName() + " drinking " + water);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock");
        }
        move();
        if (lock.tryLock()) {
            try {
                System.out.println(this.getName() + " eating " + food);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock");
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
        Bear klaas = new Bear("klaas");
        Bear pablo = new Bear("pablo");
        Food food = new Food("cookies");
        Beverage beverage = new Beverage("beer");
        try {
            executorService.submit(() -> klaas.eatAndDrink(food, beverage));
            executorService.submit(() -> pablo.drinkAndEat(beverage, food));
        } finally {
            executorService.shutdown();
        }
    }

}

