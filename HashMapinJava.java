import java.util.HashMap;

public class HashMapinJava {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "Aman");
        map.put(24, "Ankit");
        map.put(37, "Rupam");
        System.out.println(map);
        System.out.println(map.get(37));// returns value String
        System.out.println(map.get(10));// returns null
        System.out.println(map.containsKey(31));
        System.out.println(map.containsValue("Ankit"));
        System.out.println(map.keySet()); // returns an integer array
        System.out.println(map.values()); // returns an string array
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
