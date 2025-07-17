class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile(String a, int b) {
        brand = a;
        price = b;
        System.out.println("I am Constructor");
    }

    static {
        name = "Smartphone";
        System.out.println("I am Static Block");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("MI", 5000);
        Mobile obj2 = new Mobile("Samsung", 45000);
        new Mobile("Vivo", 25000); // Anonymous Object which has no reference variable
    }
}
