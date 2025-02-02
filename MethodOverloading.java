public class MethodOverloading {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int c = obj.multiply(5, 6);
        int d = obj.multiply(4, 5, 8);
        System.out.println(c);
        System.out.println(d);
    }
}
