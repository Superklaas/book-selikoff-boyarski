package thread_safe_code;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class LionPenManager {

    public static final int NUMBER_OF_THREADS = 4;

    /**
     * No cyclic barrier.
     * Multiple tasks will execute this sequence without coordination.
     */
    void performTaskWithoutBarrier() {
        System.out.println("remove lions");
        System.out.println("cleaning pens");
        System.out.println("adding lions");
    }

    /**
     * Sequence of tasks with cyclic barriers in between.
     * All threads have to wait at barrier until all other threads have completed task.
     */
    void performTaskWithBarrier(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            System.out.println("remove lions");
            c1.await();
            System.out.println("cleaning pens");
            c2.await();
            System.out.println("adding lions");
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        } catch (BrokenBarrierException e) {
            System.out.println("barrier broken");
        }
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        try {
            var lionPenManager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("***all pens have been cleaned"));
            for (int i = 0; i < 4; i++) {
                service.submit(() -> lionPenManager.performTaskWithBarrier(c1, c2));
//                 service.submit(lionPenManager::performTaskWithoutBarrier);
            }
        } finally {
            service.shutdown();
        }
    }

}
