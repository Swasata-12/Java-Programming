// Write a code to get area and perimeter of circle,square and rectangle 

class Square {
    float side;

    public void setSide(float n) {
        side = n;
    }

    public float sqArea() {
        return side * side;
    }

    public float sqPerimeter() {
        return 4 * side;
    }
}

class Rectangle {
    float length, breadth;

    public void setSide_rec(float n1, float n2) {
        length = n1;
        breadth = n2;
    }

    public float recArea() {
        return length * breadth;
    }

    public float recPerimeter() {
        return 2 * (length + breadth);
    }
}

class Circle {
    float radius;

    public void setRad(float n3) {
        radius = n3;
    }

    public float cirArea() {
        return 3.14f * (radius * radius);
    }

    public float cirPerimeter() {
        return 2 * 3.14f * radius;
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        s1.setSide(3);
        System.out.println("Area of the Square is: " + s1.sqArea());
        System.out.println("Perimeter of the Square is: " + s1.sqPerimeter());
        r1.setSide_rec(6, 2);
        System.out.println("Area of the Rectangle is: " + r1.recArea());
        System.out.println("Perimeter of the Rectangle is: " + r1.recPerimeter());
        c1.setRad(4);
        System.out.println("Area of the Circle is: " + c1.cirArea());
        System.out.println("Perimeter of the Circle is: " + c1.cirPerimeter());
    }
}
