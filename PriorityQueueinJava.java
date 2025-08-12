import java.util.PriorityQueue;

public class PriorityQueueinJava {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(56);
        pq.add(10);
        pq.add(2);
        pq.add(12);
        pq.add(5);
        System.out.println("The Queue is: " + pq);
        System.out.println("The Priority order of the stored item are: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println("Removed element: " + pq.remove());
        System.out.println("The head elemennt is: " + pq.peek());
    }
}
