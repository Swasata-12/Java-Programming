// Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class Exercise38 {
    static int convertDecimalToBinary(int decimal) {
        int power = 0;
        int binary = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10, power);
            power++;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary number is: " + convertDecimalToBinary(decimal));
    }
}
