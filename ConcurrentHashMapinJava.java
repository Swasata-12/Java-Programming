// ConcurrentHashMap in Java is a thread-safe implementation of the Map interface, designed for use in multi-threaded environments where multiple threads might simultaneously access and modify the map. It provides higher concurrency than Hashtable or Collections.synchronizedMap(new HashMap()) by employing a more granular locking mechanism.
// Compare and Swap approach --> no locking except resizing or collision (no segmentation like hashtable)

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapinJava {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Swasata", 96);
        map.put("Anup", 58);
        map.put("Rohan", 89);
        map.put("Aninda", 12);
        System.out.println(map);
    }
}
