import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(45);
        vector.add(78);
        vector.add(58);
        vector.add(8);
        vector.add(10);
        vector.add(28);
        vector.add(2, 20);// insert an element at the specified index
        System.out.println(vector.get(3));
        vector.set(4, 114);
        vector.remove(5);
        System.out.println("The size of the vector is: " + vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.contains(58));
        System.out.println("The capacity is: " + vector.capacity());
        System.out.println(vector);
        for (Integer element : vector) {
            System.out.println(element);
        }
    }
}
