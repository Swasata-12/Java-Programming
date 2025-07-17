// Write a Java program to count the occurence of a digit in a given number 

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the digit you want to count: ");
        int d = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == d) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The digit " + d + " occured " + count + " times");
        sc.close();
    }
}
