import java.util.Arrays;
import java.util.Scanner;

public class BasicsofArray {
    public static void main(String[] args) {
        // int age[]; declaration
        // int[] age; declaration
        // age=new int[5]; memory allocation
        Scanner sc = new Scanner(System.in);
        int age[] = new int[5];
        int marks[] = { 41, 46, 12, 78 };
        String names[] = { "Ram", "Harish", "Karan", "Monty" };
        String str[] = new String[5];
        int numbers[] = { 23, 14, 56, 78 };
        // int values[][] = new int[3][4]; // 2-D Array
        int values[][] = {
                { 12, 14, 78 },
                { 78, 25, 100 },
                { 85, 45, 2 }
        };
        int rnos[] = new int[5];
        int arr2D[][] = new int[3][3];
        int sum = 0;
        age[0] = 54;
        age[1] = 74;
        age[2] = 72;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(age.length);
        System.out.println(marks.length);
        System.out.println(values[0][1]);

        // array of objects
        System.out.println("Enter " + str.length + " names: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // Taking input in an 2D array
        System.out.println("Give input in an 3x3 array: ");
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = sc.nextInt();
            }
        }
        System.out.println("The elements in the arr2D are:");
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("Printing using toString() method of Arrays class:");
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // Taking input in an array from the user
        System.out.println("Enter the roll no of 5 students:");
        for (int i = 0; i < rnos.length; i++) {
            rnos[i] = sc.nextInt();
        }
        System.out.println("Roll nos of 5 students are:");
        for (int i : rnos) {
            System.out.print(i + " ");
            System.out.println("\n");
        }
        System.out.println("Printing using toString() method of Arrays class:");
        System.out.println(Arrays.toString(rnos));

        // printing array elements using for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is " + names[i]);
        }

        // printing array elements using for each loop
        for (String name : names) {
            System.out.println(name);
        }

        for (int mark : marks) {
            System.out.println(mark);
        }

        // sum of all array elements
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("The sum of all the elements of the array numbers is: " + sum);

        // Iterating over a 2-D array
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
