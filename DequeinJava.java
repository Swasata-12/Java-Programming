import java.util.ArrayDeque;
import java.util.Deque;

public class DequeinJava {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(10);
        dq.offerFirst(12);
        dq.offerFirst(23);
        dq.addLast(20);
        dq.offerLast(25);
        dq.add(1);
        dq.offer(45);
        dq.push(65);
        System.out.println("The queue is: " + dq);
        System.out.println("First element: " + dq.getFirst());
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Last element: " + dq.getLast());
        System.out.println("Last element: " + dq.peekLast());
        dq.removeFirst();
        dq.pollLast();
        System.out.println("The queue is: " + dq);
    }
}
