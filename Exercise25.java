// Java Program to Check Armstrong Number

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remainder, result = 0;
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int l = String.valueOf(originalNumber).length();
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, l);
            originalNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
