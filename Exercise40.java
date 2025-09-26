// Java program to calculate the sum of digits of a number.

import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
