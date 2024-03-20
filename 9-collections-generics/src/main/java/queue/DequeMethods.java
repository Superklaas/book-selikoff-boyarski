package queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeMethods {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(10);
        deque.offerLast(4);
        deque.offerFirst(14);
        System.out.println(deque);

        deque.peekFirst();
        deque.pollLast();
        System.out.println(deque);

        deque.remove();
        deque.removeLast();
        System.out.println(deque);

        deque.peekFirst();
        deque.poll();
        deque.getFirst();


    }

}
