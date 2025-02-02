class MyEmployee {
    // First constructor
    MyEmployee(String s, int i) {
        System.out.println("The name of the first employee is: " + s);
        System.out.println("The id of the first employee is: " + i);
    }

    // Constructor overloaded
    MyEmployee(String s, int i, int salary) {
        System.out.println("The name of the second employee is: " + s);
        System.out.println("The id of the second employee is: " + i);
        System.out.println("The salary of the second employee is: " + salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // MyEmployee obj = new MyEmployee("Shubham", 90);
        // MyEmployee obj1 = new MyEmployee("Swasata", 97, 45000);
    }
}
