public class Varargs {
    static int add(int x, int... arr) {
        int sum = x;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 2 and 3 is " + add(2, 3, 2));
        System.out.println("The sum of 1 and 2 is " + add(2, 1, 2));
        System.out.println("The sum of 4 and 5 is " + add(2, 4, 5));
    }
}
