// Java program to print a square pattern of stars based on user input.
// The pattern looks like this for 4 rows:
// ****
// ****
// ****
// ****

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
