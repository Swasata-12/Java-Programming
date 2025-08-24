import java.util.Scanner;

public class Exercise30 {
    static boolean isArmstrong(int n) {
        int remainder, result = 0;
        int originalNumber = n;
        int l = String.valueOf(originalNumber).length();
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, l);
            originalNumber /= 10;
        }
        if (result == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 3 digit no: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the last 3 digit no: ");
        int num2 = sc.nextInt();
        System.out.println("The Armstrong numbers between " + num1 + " to " + num2 + " are: ");
        for (int i = num1; i < num2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
