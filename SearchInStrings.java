// Java code to check if an alphabet present in a String or not.

public class SearchInStrings {
    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Kunal";
        char target = 's';
        System.out.println(search(name, target));
    }
}
