// Write a Java program to find the minimum element in an array.
// Write a Java program to find the maximum element in an array.

public class MinValue {
    public static void main(String[] args) {
        int numbers[] = { 12, 45, 10, 78, 112, 3, 9, 58, 14 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The minimum number is " + min);
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
