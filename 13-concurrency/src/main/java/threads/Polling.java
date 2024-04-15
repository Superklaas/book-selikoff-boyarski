package threads;

import java.util.stream.IntStream;

public class Polling {

    static int counter = 0;

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread(); // mainThread manages while loop, checks if counter has reached 10_000_000

        Runnable task = () -> {
            IntStream.range(0, 1_000_000).forEach(i -> counter++);
            mainThread.interrupt(); // interrupt main thread when counter reaches 10_000_000
        };
        Thread thread1 = new Thread(task); // thread1 performs task: augmenting counter to 10_000_000
        thread1.start();
        long start = System.currentTimeMillis();
        System.out.println("process started");

        while (counter < 1_000_000) {
            System.out.println("process busy");
            try {
                Thread.sleep(100);// mainThread sleeps for given time length, then check while condition again
            } catch (InterruptedException e) {
                System.out.println("process interrupted"); //mainThread is interrupted when counter reaches 10_000_000
            }
        }

        System.out.println("process ended");
        System.out.println(System.currentTimeMillis() - start);

    }

}
