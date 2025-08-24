public class Shadowing {
    static int x = 90; // this will be shadowed in line 10

    static void fun() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40;
        System.out.println(x); // 40
        fun();
    }
}
