import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
            sum += (n * i);
        }
        System.out.println("The sum of the elements is " + sum);
        System.out.println("The Table in reverse order is");
        for (int i = 10; i > 0; i--) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
        sc.close();
    }
}
