import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0, sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            sumEven += 2 * i;           // 2n for getting even numbers
            sumOdd += 2 * i - 1;        // 2n-1 for getting odd numbers 
        }
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
        System.out.println("The sum of first " + n + " even numbers is " + sumEven);
        System.out.println("The sum of first " + n + " odd numbers is " + sumOdd);
        sc.close();
    }
}
