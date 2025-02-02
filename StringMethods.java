import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(4, 7));
        System.out.println(name.replace('a', 't'));
        System.out.println(name.startsWith("My"));
        System.out.println(name.endsWith("ta"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("Swa"));
        System.out.println(name.indexOf('a', 2));
        System.out.println(name.lastIndexOf("y"));
        System.out.println(name.lastIndexOf("ta", 5));
        System.out.println(name.equals("swasata"));
        System.out.println(name.equalsIgnoreCase("swasata"));
        sc.close();
    }
}
