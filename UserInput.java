// Code is incorrect

import java.util.Scanner;

public class UserInput {
    void printJava() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number for checking: ");
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        System.out.println("Enter 1 number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter 2 number:");
        int secondNumber = sc.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("The sum is: " + result);
        UserInput obj = new UserInput();
        for (int i = 0; i <= 3; i++) {
            obj.printJava();
        }
        sc.close();
    }
}
