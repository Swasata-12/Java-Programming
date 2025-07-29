// The IdentityHashMap in Java is a specialized implementation of the java.util.Map interface that distinguishes itself from other Map implementations like HashMap by its unique approach to key comparison.
// Unlike HashMap which uses the equals() method to determine key equality, IdentityHashMap uses reference equality (==). This means two keys are considered equal only if they refer to the exact same object in memory.
// Instead of relying on an object's hashCode() method, IdentityHashMap uses System.identityHashCode() for hashing keys. This method returns the default hash code for an object, which is typically derived from its memory address.

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
        System.out.println("The size of the Identity Hash map is: " + map.size());// return 2
    }
}
