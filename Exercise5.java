// Write a program to find out the type of website from the URL:
// .com – commercial website
// .org – organization website
// .in – Indian website

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL:");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an Organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } else {
            System.out.println("This is not a website");
        }
        sc.close();
    }
}
