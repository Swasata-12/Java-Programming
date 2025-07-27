import java.util.ArrayList;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class MyComaparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class ComparatorinJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        list.add(56);
        list.add(12);
        list.add(10);
        words.add("Banana");
        words.add("Apple");
        words.add("Date");
        list.sort(new MyComaparator());// by default list.sort() do ascending order
        words.sort(new StringLengthComparator());
        // we can also use Lambda expression here
        list.sort((a, b) -> b - a);
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(list);
        System.out.println(words);
    }
}
