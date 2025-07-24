// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

import java.util.Scanner;

public class Exercise26 {
    static boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 2; i <= number / 2; i++) {
            if (checkPrime(i)) {
                if (checkPrime(number - i)) {
                    System.out.println(number + " = " + i + " + " + (number - i));
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }

    }
}
