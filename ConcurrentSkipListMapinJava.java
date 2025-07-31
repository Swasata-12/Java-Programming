import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapinJava {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("Vivek", 14);
        map.put("Soup", 22);
        map.put("Orange", 56);
        map.put("Banana", 25);
        System.out.println(map);
    }
}
