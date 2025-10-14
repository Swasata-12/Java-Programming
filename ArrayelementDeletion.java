import java.util.Arrays;
import java.util.Scanner;

public class ArrayelementDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 15, 25, 10, 56, 89 };
        System.out.println("Array before deletion:" + Arrays.toString(arr));
        System.out.println("Enter the index of the element to be deleted:");
        int position = sc.nextInt();
        if (position >= arr.length || position < 0) {
            System.out.println("Invalid position");
        } else {
            int arrNew[] = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != position) {
                    arrNew[j++] = arr[i];
                }
            }
            System.out.println("Array after deletion: " + Arrays.toString(arrNew));
        }
        sc.close();
    }
}
