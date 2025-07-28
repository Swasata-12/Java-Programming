// The IdentityHashMap in Java is a specialized implementation of the java.util.Map interface that distinguishes itself from other Map implementations like HashMap by its unique approach to key comparison.
// Unlike HashMap which uses the equals() method to determine key equality, IdentityHashMap uses reference equality (==). This means two keys are considered equal only if they refer to the exact same object in memory.

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapinJava {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
