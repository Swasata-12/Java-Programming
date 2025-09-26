// Java program to check if a number is a palindrome or not.

import java.util.Scanner;

public class Exercise39 {
    static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
        if (reversedNumber == number) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
