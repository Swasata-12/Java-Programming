// Java program to perform basic arithmetic operations based on user input.

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform: ");
        char op = sc.next().trim().charAt(0);
        System.out.println("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println("The sum is: " + (num1 + num2));
                break;

            case '-':
                System.out.println("The difference is: " + (num1 - num2));
                break;

            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("The quotient is: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("The remainder is: " + (num1 % num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
