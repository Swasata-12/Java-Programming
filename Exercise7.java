// Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 45, 14, 12, 10, 78, 98 };
        boolean isFound = false;
        System.out.println("Enter the number you want to search:");
        int num = sc.nextInt();
        for (int i : numbers) {
            if (i == num) {
                System.out.println("Your element is present in the array");
                isFound = true;
                break;
            }
        }
        if (!isFound) {

            System.out.println("Your element is not present in the array");
        }
        sc.close();
    }
}
