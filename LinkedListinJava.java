import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListinJava {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        list.add(25);
        list.add(56);
        list.add(14);
        list.add(45);
        System.out.println(list.get(2)); // O(n)
        list.addLast(123); // O(1)
        list.addFirst(10); // O(1)
        list.add(1, 102);
        list.remove(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println("The first node of the list is: " + list.getFirst());
        System.out.println("The last node of the list is: " + list.getLast());
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
