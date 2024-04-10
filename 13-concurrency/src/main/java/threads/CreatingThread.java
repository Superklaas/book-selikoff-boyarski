package threads;

import java.util.stream.IntStream;

public class CreatingThread {

    public static void main(String[] args) {

        // Runnable objects defining tasks
        Runnable printInventory = () -> System.out.println("printing zoo inventory");
        Runnable printRecordsStream = () -> IntStream.range(0,3).forEach(i -> System.out.printf("printing stream record %d%n", i));
        Runnable printRecordsLoop = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.printf("printing loop record %d%n", i);
            }
        };

        // start(): new threads are started & execute tasks asynchronously
        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecordsStream).start();
        new Thread(printRecordsLoop).start();
        new Thread(printInventory).start();
        System.out.println("end");

        // run(): no new thread is started - synchronous execution
//        System.out.println("begin");
//        new Thread(printInventory).run();
//        new Thread(printRecordsStream).run();
//        new Thread(printRecordsLoop).run();
//        new Thread(printInventory).run();
//        System.out.println("end");

    }


}
