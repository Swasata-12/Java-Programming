// Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenDigits {
    static int findNumbers(int nums[]) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num *= -1;
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }
}
