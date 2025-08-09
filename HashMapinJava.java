import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

public class HashMapinJava {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Person, String> map1 = new HashMap<>(); // Hashmap to map object of Person to Profession
        Person p1 = new Person("Swasata", 1);
        Person p2 = new Person("Rahul", 2);
        Person p3 = new Person("Swasata", 1);
        map1.put(p1, "Author"); // hashcode1 --> index1
        map1.put(p2, "Doctor"); // hashcode2 --> index2
        map1.put(p3, "Analyzer"); // hashcode3 --> index3
        System.out.println("Hashmap size: " + map1.size());
        System.out.println("Value of p1: " + map1.get(p1));
        System.out.println("Value of p3: " + map1.get(p3));
        System.out.println(map1);
        map.put(31, "Aman");
        map.put(24, "Ankit"); // Time complexity = O(1)
        map.put(37, "Rupam");
        map.put(14, "Anupam");
        map.putIfAbsent(78, "Swasata");// add the value wrt key if the key not present
        System.out.println(map);
        System.out.println(map.get(37));// returns value String Time complexity = O(1)
        System.out.println(map.get(10));// returns null
        String res = map.getOrDefault(12, "0");
        System.out.println(res);// get specified value or return default
        System.out.println(map.containsKey(31));
        System.out.println(map.containsValue("Ankit"));
        System.out.println(map.keySet()); // returns an integer array
        System.out.println(map.values()); // returns an string array
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.remove(14);
        System.out.println("After remove: " + map);

        // String a = "Swasata";
        // System.out.println(a.hashCode());
    }
}
