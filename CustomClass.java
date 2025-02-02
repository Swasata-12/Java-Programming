class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    // getter
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setName(String n) {
        name = n;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.id = 97;
        // obj.name = "Swasata Nandy";
        obj.setName("Swasata Nandy");
        obj.salary = 12000;
        // System.out.println(obj.id);
        // System.out.println(obj.name);
        obj.printDetails();
        System.out.println(obj.getName());
        System.out.println("Salary is: " + obj.getSalary());
    }
}
