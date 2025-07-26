import java.util.*;

public class ArrayListinJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(10);
        ArrayList<Integer> l3 = new ArrayList<>(5);

        // Creating an ArrayList from another collection
        List<String> anotherList = Arrays.asList("Apple", "Banana", "Orange");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);
        System.out.println(l3.getClass().getName());
        System.out.println(anotherList.getClass().getName());
        Scanner sc = new Scanner(System.in);
        l2.add(5);
        l2.add(1);
        l2.add(8);
        l2.add(2);
        l1.add(58);
        l1.add(10);
        l1.add(12); // used to insert an element in the ArrayList
        l1.add(97);
        l1.add(56);
        l1.add(28);
        // l1.clear();
        l1.add(0, 25); // Inserts an element at the given index
        l1.addAll(0, l2); // merged into another Arraylist
        l1.remove(0); // used to delete or remove an element at a given index
        l1.remove(Integer.valueOf(58)); // remove the value 58 from the list l1
        l1.set(4, 100); // set the element at the given index
        System.out.println(l1); // printing the arraylist in horizontal manner
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(97));
        System.out.println(l1.lastIndexOf(12));
        System.out.println(l1.size());
        // anotherList.add(1, "Aman");

        // printing the arraylist in vertical manner
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // Taking input to an arraylist from user
        System.out.println("Enter element to the Arraylist of size 5: ");
        for (int i = 0; i < 5; i++) {
            l3.add(sc.nextInt());
        }
        for (int i = 0; i < l3.size(); i++) {
            System.out.println(l3.get(i));
        }
        System.out.println(l3);

        // Printing the arraylist l3 using for each loop
        for (int element : l3) {
            System.out.println(element);
        }
        System.out.println(listFromCollection);
        // Collections.sort(l3);
        l3.sort(null);
        System.out.println("After sorting the list is: " + l3);
        sc.close();
    }
}
