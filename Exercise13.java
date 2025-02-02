import java.util.Scanner;

class Cylinder {
    private float radius;
    private float height;

    Cylinder(float r, float h) {
        this.radius = r;
        this.height = h;
    }

    public float surfaceArea() {
        return 2 * 3.14f * (radius * radius) + 2 * 3.14f * radius * height;
    }

    public float volume() {
        return 3.14f * (radius * radius) * height;
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder:");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the Cylinder:");
        float h = sc.nextFloat();
        Cylinder cy = new Cylinder(r, h);
        System.out.println("Total Surface Area of the Cylinder is: " + cy.surfaceArea());
        System.out.println("Volume of the Cylinder is: " + cy.volume());
        sc.close();

    }
}
