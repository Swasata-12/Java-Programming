// Java program to find the second largest element and second smallest element in an array.

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

    static int findSecondMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 45, 12, 90, 34, 89, 90 };
        int value = findSecondMax(arr);
        int value2 = findSecondMin(arr);
        System.out.println("The second largest value in the array is: " + value);
        System.out.println("The second smallest value in the array is: " + value2);
    }
}
