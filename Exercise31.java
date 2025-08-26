// Write a program to enter the numbers until the user wants to stop and then display the count of positive, negative, and zero numbers.

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.println("Do you want to continue? (yes/no)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}
