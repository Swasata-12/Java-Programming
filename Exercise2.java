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

        // Write a Java program to convert Kilometers to Miles
        System.out.println("Enter distance in Kilometers: ");
        double km = sc.nextFloat();
        double ml = 0.621371 * km;
        System.out.println("The given distance in Miles is: " + ml);

        // Write a Java program to find the maximum no among three numbers
        System.out.println("Enter Three numbers: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        if (a1 >= b1 && a1 >= c1) {
            System.out.println("The Largest number is: " + a1);
        } else if (b1 >= c1) {
            System.out.println("The Largest number is: " + b1);
        } else {
            System.out.println("The Largest number is: " + c1);
        }
        int maximum = Math.max(c1, Math.max(a1, b1));
        System.out.println("The Largest number is: " + maximum);

        // Write a Java program to calculate the total cost of your shopping cart. Ask
        // the user to enter the price of three items they are buying and the program
        // gives the total cost including tax (assume tax is 18% of the total cost)
        System.out.println("Enter the price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser + (0.18f * (pencil + pen + eraser));
        System.out.println("The total cost including tax is: " + total);

        // Write a Java program to check whether a number entered by the user is prime
        System.out.println("Enter the number to check if it is prime or not: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("The number is not prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("The number is prime");
        }

        // Write a Java program to keep taking numbers as input from the user until
        // the user enters a multiple of 10 (10, 20, 30, ...).
        while (true) {
            System.out.println("Enter a number: ");
            int userInput = sc.nextInt();
            if (userInput % 10 == 0) {
                break;
            }
            System.out.println("You entered: " + userInput);
        }

        // Write a Java program to keep taking numbers as input from the user and skip
        // the number if it is a multiple of 10 (10, 20, 30, ...).
        int count = 0;
        while (count <= 10) {
            System.out.println("Enter a number: ");
            int userInput2 = sc.nextInt();
            if (userInput2 % 10 == 0) {
                continue;
            }
            System.out.println("You entered: " + userInput2);
            count++;
        }
        sc.close();
    }
}
