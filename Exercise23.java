// Check whether an alphabet is vowel or consonant using if..else statement

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character in small letter: ");
        char ch = sc.next().toLowerCase().trim().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
    }
}
