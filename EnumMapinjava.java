import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumMapinjava {
    public static void main(String[] args) {
        EnumMap<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Gym");
        map.put(Day.THURSDAY, "Sleep");
        map.put(Day.WEDNESDAY, "Running");
        map.put(Day.FRIDAY, "Walk");
        System.out.println(map);
        System.out.println("In Friday I do: " + map.get(Day.FRIDAY));
        for (EnumMap.Entry<Day, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
