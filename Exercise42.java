// Java program to find the second largest element in an array.

public class Exercise42 {
    static int findSecondMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 34, 89, 90 };
        int value = findSecondMax(arr);
        System.out.println("The second largest value in the array is: " + value);
    }
}
