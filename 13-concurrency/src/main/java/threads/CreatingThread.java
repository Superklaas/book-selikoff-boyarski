package threads;

import java.util.stream.IntStream;

public class CreatingThread {

    public static void main(String[] args) {

        // Runnable objects defining tasks
        Runnable printInventory = () -> System.out.println("printing zoo inventory");
        Runnable printRecordsStream = () -> IntStream.range(0,3).forEach(i -> System.out.printf("printing record %d using stream %n", i));
        Runnable printRecordsLoop = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.printf("printing record %d using loop %n", i);
            }
        };

        // start(): new threads are started (one thread per task) - aynschronous execution of tasks
        System.out.println("begin");
        Thread thread = new Thread(printInventory);
        System.out.println("state thread printInventory: " + thread.getState());
        thread.start();
        System.out.println("state thread printInventory: " + thread.getState());
        new Thread(printRecordsStream).start();
        new Thread(printRecordsLoop).start();
        new Thread(printInventory).start();
        System.out.println("end");
        System.out.println("state thread printInventory: " + thread.getState());

        // run(): no new thread is started - synchronous execution of tasks
//        System.out.println("begin");
//        new Thread(printInventory).run();
//        new Thread(printRecordsStream).run();
//        new Thread(printRecordsLoop).run();
//        new Thread(printInventory).run();
//        System.out.println("end");

    }


}
