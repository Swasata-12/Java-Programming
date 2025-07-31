// Hashtable is synchronized
// no null key or value
// Legacy class, ConcurrentHashMap
// slower than hashmap
// only linkedlist in case of collision

import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Map;

public class HashTableinJava {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(14, "Swasata");
        table.put(25, "Aman");
        table.put(47, "Ankit");
        table.put(10, "Riddha");
        System.out.println(table);
        System.out.println("The value at key 47 is: " + table.get(47));
        System.out.println("The key 10 eist?: " + table.containsKey(10));
        System.out.println("The value Ankit exist?: " + table.containsValue("Ankit"));
        System.out.println(table.keySet());
        System.out.println(table.values());
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toUpperCase());
        }
        table.remove(47);
        System.out.println(table);
    }
}
