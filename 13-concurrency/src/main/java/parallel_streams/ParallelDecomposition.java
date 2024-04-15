package parallel_streams;

import java.util.List;

public class ParallelDecomposition {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // unsorted parallel stream
        long start = System.currentTimeMillis();
        list.parallelStream()
                .map(ParallelDecomposition::doWork)
                .forEach(i -> System.out.print(i + " "));
        System.out.println("unsorted parallel stream: " + (System.currentTimeMillis() - start) + " ms");

        // sorted parallel stream
        start = System.currentTimeMillis();
        list.parallelStream()
                .map(ParallelDecomposition::doWork)
                .forEachOrdered(i -> System.out.print(i + " "));
        System.out.println("sorted parallel stream: " + (System.currentTimeMillis() - start) + " ms");

        // serial stream: for each element in stream, 2 seconds will be taken
        start = System.currentTimeMillis();
        list.stream()
                .map(ParallelDecomposition::doWork)
                .forEach(integer -> System.out.print(integer + " "));
        System.out.println("serial stream: " + (System.currentTimeMillis() - start) + " ms");

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
