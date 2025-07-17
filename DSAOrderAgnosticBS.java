public class DSAOrderAgnosticBS {
    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find wheather the array is sorted in ascending or decending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int arr[] = { 99, 80, 75, 22, 11, 10, 5, 2, -3 };
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        if (ans >= 0) {
            System.out.println("Your element is present at index: " + ans);
        } else {
            System.out.println("Your element is not present in the array");
        }
    }
}
