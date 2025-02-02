// Write a program to print the following pattern :
// ****
// ***
// **
// *

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }

        // Reverse star pattern
        System.out.println("Reverse pattern:");
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
