import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Write a program to sum three numbers in Java
        int a = 14;
        int b = 4;
        int c = 45;
        int sum = a + b + c;
        System.out.println("The sum of the numbers are: " + sum);

        // Write a program to calculate CGPA using marks of three subjects (out of 100)
        float subject1 = 45;
        float subject2 = 48;
        float subject3 = 95;
        float cgpa = ((subject1 + subject2 + subject3) / 3) / 9.5f;
        System.out.println("The CGPA is: " + cgpa);

        // Write a Java program that asks the user to enter his/her name and greets them
        // with “Hello <name>,
        // have a good day” text
        System.out.println("What is your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day");

        // Write a Java program to detect whether a number entered by the user is an
        // integer or not
        System.out.println("Enter a number: ");
        // System.out.println(sc.hasNextInt());

        // Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println("Enter your name:");
        String newName = sc.next();
        System.out.println(letter.replace("<|name|>", newName));
        sc.close();
    }
}
