import java.util.Arrays;

public class SwapingArraayEle {
    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 23, 9, 18 };
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
