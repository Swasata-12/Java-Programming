// Every class in java extends the Object class which has multiple methods

class Laptop {
    String model;
    int price;
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 20000;
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 20000;
        System.out.println(obj1); // it actually call obj.toString() method in the background
        System.out.println(obj1.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
    }
}
