// Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// 2.5L – 5.0L 5%     5.0L – 10.0L 20%    Above 10.0L  30%

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("Enter your income in Lakhs per annum:");
        float income = sc.nextFloat();
        if (income > 2.5f && income <= 5f) {
            tax += 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5f);
            tax += 0.3f * (income - 10.0f);
        } else {
            tax += 0;
        }
        System.out.println("The total tax paid by the employee is:" + tax);
        sc.close();
    }
}
