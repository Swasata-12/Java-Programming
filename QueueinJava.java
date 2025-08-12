import java.util.LinkedList;
import java.util.Queue;

public class QueueinJava {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.offer(56);
        list.add(2);
        list.offer(6);
        list.add(10);
        list.offer(25);
        list.add(45);
        list.offer(102);
        list.add(12);
        list.offer(78);
        System.out.println("The removed element is: " + list.remove());
        System.out.println("The removed element is: " + list.poll());
        System.out.println("The Top item in the queue is: " + list.peek());
        System.out.println("The Top item in the queue is: " + list.element());
        System.out.println(list);
    }
}
