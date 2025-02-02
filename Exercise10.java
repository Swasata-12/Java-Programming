// Write a recursive function to calculate the sum of first n natural numbers.

import java.util.Scanner;

public class Exercise10 {
    static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The sum of the first " + n + " natural numbers is: " + sumNatural(n));
        sc.close();
    }
}
