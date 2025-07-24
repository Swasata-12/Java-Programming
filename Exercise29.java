// Java Program to Concatenate Two Arrays

import java.util.Arrays;

public class Exercise29 {
    public static void main(String[] args) {
        int pos = 0;
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        int length = array1.length + array2.length;
        int[] result = new int[length];
        for (int i : array1) {
            result[pos] = i;
            pos++;
        }
        for (int i : array2) {
            result[pos] = i;
            pos++;
        }

        System.out.println("The Array is: " + Arrays.toString(result));
    }
}
