public class FloorOfaNo {
    static int floor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // if (target > arr[arr.length - 1]) {
        //     return -1;
        // }

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
    
    public static void main(String[] args) {
        int arr[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int target = 14;
        int ans = floor(arr, target);
        if (ans >= 0) {
            System.out.println("The Floor of the given targeted number is: " + arr[ans]);
        } else {
            System.out.println("Target is not present in the array");
        }
    }
}
