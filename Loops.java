public class Loops {
    public static void main(String[] args) {
        int i, j, k;
        // while loop
        i = 0;
        while (i <= 3) {
            System.out.println(i + " Printing using While loop");
            i++;
        }
        // do...while loop
        j = 0;
        do {
            System.out.println(j + " Printing using do while loop");
            j++;
        } while (j <= 3); // semicolon is required here
        // for loop
        for (k = 0; k <= 3; k++) {
            System.out.println(k + " Printing using for loop");
        }
        // nested loop
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                System.out.println("(" + l + "," + m + ")");
            }
        }
        // Printing even numbers
        System.out.println("First five even numbers:");
        for (int a = 0; a < 5; a++) {
            System.out.println(2 * a);
        }
        for (int b = 5; b > 0; b--) {
            System.out.println(2 * (b - 1));
        }
        // Printing odd numbers
        System.out.println("First five odd numbers:");
        for (int c = 0; c < 5; c++) {
            System.out.println(2 * c + 1);
        }
        for (int d = 5; d > 0; d--) {
            System.out.println(2 * d - 1);
        }
    }
}
