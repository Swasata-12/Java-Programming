// Java program to find the number of unique elements in a sorted array and remove duplicates.

import java.util.Arrays;

public class Exercise44 {
    static int removeDuplicates(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 2, 2, 3 };
        int count = removeDuplicates(arr);
        System.out.println("The number of unique elements in the array is: " + count);
    }
}
