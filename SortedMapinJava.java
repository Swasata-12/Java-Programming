import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapinJava {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>(); // (a, b) -> b.length() - a.length()
        map.put("Vivek", 10);
        map.put("Mohit", 45);
        map.put("Shubham", 56);
        map.put("Rohan", 25);
        map.put("Vipul", 100);
        System.out.println(map);
        System.out.println("The first key of this map is: " + map.firstKey());
        System.out.println("The last key of this map is: " + map.lastKey());
        System.out.println(map.headMap("Shubham"));
        System.out.println(map.tailMap("Rohan"));
        System.out.println(map.subMap("Rohan", "Vipul"));
    }
}
