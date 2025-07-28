import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapinJava {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(10, 0.3f, true);
        map.put("Orange", 45); // LinkedHashMap fetch data in ordered manner
        map.put("Banana", 20);
        map.put("Apple", 78);
        map.get("Orange"); // access order true
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
