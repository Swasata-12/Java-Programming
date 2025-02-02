// Create an abstract class pen with methods write() and refill() as abstract methods 
// Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
// Create a class monkey with jump() and bite() methods Create a class human which inherits this monkey class and implements basicanimal interface with eat() and sleep() methods 
// Demonstrate polymorphism using using monkey class from Q3 

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writing....");
    }

    void refill() {
        System.out.println("Refilling...");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human swasata = new Human();
        swasata.sleep();
        swasata.speak();
        swasata.eat();
        swasata.bite();
        swasata.jump();
        Monkey m = new Human(); // Polymorphism
        m.bite();
        m.jump();
        // m.eat();
        // m.speak(); not allowed
        // m.sleep();
    }
}
