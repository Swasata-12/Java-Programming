public class Methods {
    static void changeArray(int arr[]) {
        arr[2] = 95;
        System.out.println(arr[2]);
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 566;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        // Methods obj = new Methods();
        // c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " " + b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        int marks[] = { 14, 12, 45, 78, 96, 25 };
        changeArray(marks); // In case of array methods take the reference
        System.out.println(marks[2]); // Arrays are mutable in java it will change the value here as well
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
