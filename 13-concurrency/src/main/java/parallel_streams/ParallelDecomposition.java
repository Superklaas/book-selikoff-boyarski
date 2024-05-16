package parallel_streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelDecomposition {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        list.forEach(i -> System.out.print(i + " "));
        System.out.println("\n-----------------");

        // unsorted parallel stream
        long start = System.currentTimeMillis();
        list.parallelStream()
                .map(ParallelDecomposition::doWork)
                .forEach(i -> System.out.print(i + " ")); // e.g. 3 2 7 18 9 13 8 12 10 5 20 11 1 4 15 6 17 19 14 16
        System.out.println("\nunsorted parallel stream: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("-----------------");

        // sorted parallel stream
        start = System.currentTimeMillis();
        list.parallelStream()
                .map(ParallelDecomposition::doWork)
                .forEachOrdered(i -> System.out.print(i + " "));
        System.out.println("\nsorted parallel stream: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("-----------------");

        // serial stream: for each element in stream, 2 seconds will be taken
        start = System.currentTimeMillis();
        list.stream()
                .map(ParallelDecomposition::doWork)
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println("\nserial stream: " + (System.currentTimeMillis() - start) + " ms");

    }

    static int doWork(int input) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
        return input;
    }

}
