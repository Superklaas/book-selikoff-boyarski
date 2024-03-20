package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.add(1));
        System.out.println(queue.offer(2));
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);

    }

}
