// Java Program to Sort Elements in Lexicographical Order (Dictionary Order)

import java.util.Arrays;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[4];
        System.out.println("Enter 4 words: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("After sorting the array is: " + Arrays.toString(words));
    }
}
