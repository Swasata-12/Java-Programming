// Write a program to calculate the percentage of a given student in the CBSE board exam. 
// His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics:");
        int physics = sc.nextInt();
        System.out.println("Enter the marks of English:");
        int english = sc.nextInt();
        System.out.println("Enter the marks of Chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("Enter the marks of Mathematics:");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of Computer Science:");
        int computer = sc.nextInt();
        float percentage = ((physics + english + chemistry + maths + computer) / 500.0f) * 100;
        System.out.println("Percentage is: " + percentage);
        sc.close();
    }
}
