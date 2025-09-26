// Java program to convert a binary number (entered as a double) to its decimal equivalent.

import java.util.Scanner;

public class Exercise37 {
    static int convertBinaryToDecimal(double binary) {
        int power = 0;
        int decimal = 0;
        while (binary > 0) {
            int lastDigit = (int) (binary % 10);
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        double binary = sc.nextDouble();
        System.out.println("Decimal number is: " + convertBinaryToDecimal(binary));
    }
}
