// The NavigableMap interface in Java is a part of the Java Collections Framework, residing in the java.util package. It extends the SortedMap interface and provides enhanced navigation methods for sorted key-value pairs.

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapinJava {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "One");
        System.out.println(map);
        System.out.println("The first element of the map is: " + map.firstEntry());
        System.out.println("The last element of the map is: " + map.lastEntry());
        System.out.println(map.lowerKey(4));
        System.out.println(map.higherKey(2));
        System.out.println(map.ceilingKey(3));
        System.out.println(map.higherEntry(1));
    }
}
