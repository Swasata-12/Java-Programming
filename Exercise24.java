// Java Program to Display Prime Numbers Between Two Intervals

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boolean flag = false;
        System.out.println("Enter the Lower bound: ");
        int low = sc.nextInt();
        System.out.println("Enter the Upper bound: ");
        int high = sc.nextInt();
        System.out.println("The Prime numbers between this range are: ");
        for (int i = low; i <= high; i++) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
