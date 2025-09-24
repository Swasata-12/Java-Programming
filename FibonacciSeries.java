// Write a function to print the nth term of the Fibonacci series using recursion and iteration.

import java.util.Scanner;

public class FibonacciSeries {
    static int fib_iter(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

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
        System.out.println("The value using recursion is: " + fib_rec(n));
        System.out.println("The value using iteration is: " + fib_iter(n));
        sc.close();
    }
}
