// Write a program to find the factorial of a given number using for loops

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m = 1;
        System.out.println("Enter the number to get Factorial:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        System.out.println("The factorial of " + n + " is " + m);
        sc.close();
    }
}
