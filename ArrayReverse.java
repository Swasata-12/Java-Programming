// Write a Java program to reverse an array.

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = { 45, 10, 12, 58, 17 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        System.out.println("The reversed array is ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
