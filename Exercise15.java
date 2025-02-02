// Create a class circle and use inheritance to create another class cylinder from it
// Create a method for area and volume in it 

class Circle1 {
    public double radius;

    Circle1() {
        System.out.println("I am non parameterized of Circle1");
    }

    Circle1(float r) {
        System.out.println("I am Circle1 parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1 {
    public float height;

    Cylinder1(float r, float h) {
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Exercise15 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(12);
        Cylinder1 c2 = new Cylinder1(12, 4);
        System.out.println("The Area of the Circle is:" + c1.area());
        System.out.println("The Volume of the Cylinder is:" + c2.volume());
        // c2.area();
    }
}
