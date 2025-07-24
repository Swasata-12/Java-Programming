// Java Program to Reverse a Sentence Using Recursion

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i) + "");
        }
    }
}
