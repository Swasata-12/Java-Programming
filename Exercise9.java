// Write a Java program to find whether an array is sorted or not.

public class Exercise9 {
    public static void main(String[] args) {
        int arr[] = { 1, 45, 3, 4, 5, 6, 7 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is Sorted");
        } else {
            System.out.println("The array is not Sorted");
        }
    }
}
