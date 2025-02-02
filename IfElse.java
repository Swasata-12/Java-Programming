import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int x = 12;
        int y = 20;
        int age;
        int max = x > y ? x : y; // Ternary operator
        System.out.println("The value of max is " + max);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 3) {
            System.out.println("Enter your age:");
            age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You can vote");
            } else {
                System.out.println("You can't vote");
            }
            i++;
        }
        sc.close();

    }
}
