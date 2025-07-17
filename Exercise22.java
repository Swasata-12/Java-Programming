// Write a java program to find the max value from an array and also in a given range. 

import java.util.Arrays;

public class Exercise22 {
    static int maxRange(int arr[], int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int arr[]) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 23, 9, 18 };
        System.out.println("The maximum value in the array is: " + max(arr));
        System.out.println("The maximum value in range is: " + maxRange(arr, 0, 1));
        reverse(arr);
        System.out.println("The Reversed array is: " + Arrays.toString(arr));
    }
}
