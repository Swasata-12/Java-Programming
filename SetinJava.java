// Set is an interface within the Java Collections Framework (java.util package) that represents a collection of unique elements.
// No Duplicates,Unordered
// Set --> HashSet,LinkedHashSet,TreeSet,EnumSet,ConcurrentSkipListSet,CopyOnWriteArraySet

import java.util.HashSet;
import java.util.Set;

public class SetinJava {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(56);
        set.add(10);
        set.add(3);
        set.add(10);
        System.out.println(set);
        System.out.println("Contains 56: " + set.contains(56));
        for (Integer element : set) {
            System.out.println(element);
        }
    }
}
