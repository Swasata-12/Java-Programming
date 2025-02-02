public class BasicsofArray {
    public static void main(String[] args) {
        // int age[]; declaration
        // int[] age; declaration
        // age=new int[5]; memory allocation

        int age[] = new int[5];
        int marks[] = { 41, 46, 12, 78 };
        String names[] = { "Ram", "Harish", "Karan", "Monty" };
        int numbers[] = { 23, 14, 56, 78 };
        // int values[][] = new int[3][4]; // 2-D Array
        int values[][] = {
                { 12, 14, 78 },
                { 78, 25, 100 },
                { 85, 45, 2 }
        };
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
    }
}
