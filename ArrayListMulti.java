import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter [" + i + "][" + j + "] element in the array: ");
                list.get(i).add(sc.nextInt());
            }
        }
        
        // Printing all element in vertical order
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j));
            }
        }
        System.out.println(list);
        sc.close();
    }
}
