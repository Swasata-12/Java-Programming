public class SearchInRange {
    static void linearSearch(int arr[], int target, int start, int end) {
        int found = 0;
        if (arr.length == 0) {
            System.out.println("There is no element present in the array");
            return;
        }

        // Here we can use for each loop but then we have to print or return the element
        // itself
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("Your element is present at the index " + i);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element is not present in the array");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 23;
        // int start = 2;
        // int end = 7;
        linearSearch(nums, target, 2, 7);
    }
}
