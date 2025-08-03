import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListinJava {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Orange");
        list.add("Egg");
        list.add("Milk");
        list.add("Apple");
        for (String element : list) {
            System.out.println(element);
            if (element.equals("Egg")) {
                list.add("Butter");
                System.out.println("Adding element during read...");
            }
        }
        System.out.println("The list is: " + list);
    }
}
