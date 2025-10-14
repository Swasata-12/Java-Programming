// Given an array of integers, write a Java program to remove all even numbers from the array and 
// return a new array containing only the odd numbers.

import java.util.Scanner;
import java.util.Arrays;

public class Exercise41 {
    static int[] removeEven(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int arrNew[] = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arrNew[j++] = arr[i];
            }
        }
        return arrNew;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 15, 25, 10, 56, 89 };
        int[] arrNew = removeEven(arr);
        System.out.println("Array after removing even numbers: " + Arrays.toString(arrNew));
        sc.close();
    }
}
