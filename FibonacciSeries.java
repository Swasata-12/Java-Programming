// Write a function to print the nth term of the Fibonacci series using recursion.

import java.util.Scanner;

public class FibonacciSeries {
    static int fib_rec(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib_rec(n - 1) + fib_rec(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index:");
        int n = sc.nextInt();
        System.out.println("The value is: " + fib_rec(n));
        sc.close();
    }
}
