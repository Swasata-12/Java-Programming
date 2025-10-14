import java.util.Arrays;
import java.util.Scanner;

public class ArrayelementInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 15, 25, 10, 56, 89 };
        System.out.println("Array before insertion:" + Arrays.toString(arr));
        System.out.println("Enter the element to be inserted:");
        int element = sc.nextInt();
        System.out.println("Enter the index where the element is to be inserted:");
        int position = sc.nextInt();
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        if (position > arr.length - 1 || position < 0) {
            System.out.println("Invalid position");
        } else {
            for (int i = arrNew.length - 1; i > position; i--) {
                arrNew[i] = arrNew[i - 1];
            }
            arrNew[position] = element;
            System.out.println("Array after insertion: " + Arrays.toString(arrNew));
        }
        sc.close();
    }
}
