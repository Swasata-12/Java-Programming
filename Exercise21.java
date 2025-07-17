// Write a Java program to reverse a given number 

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversed = 0;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            int remainder = n % 10;
            reversed = (reversed * 10) + remainder;
            n = n / 10;
        }
        System.out.println("The Reversed number is: " + reversed);
        sc.close();
    }
}
