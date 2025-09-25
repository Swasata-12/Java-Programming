// Java program to calculate nCr (combinations) using a recursive factorial method.

import java.util.Scanner;

public class Exercise36 {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("nCr = " + factorial(n) / (factorial(r) * factorial(n - r)));
    }
}
