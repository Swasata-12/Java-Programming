class Animal {
    public void walk() {
        System.out.println("Starts walking....");
    }

    public void attack() {
        System.out.println("Attacking...");
    }
}

class Dog extends Animal {
    String name;

    // constructor
    public Dog(String name) {
        this.name = name;
        System.out.println("Dog name is " + this.name + " before changing");
    }

    public void setName(String s) {
        name = s;
    }

    public void bark() {
        System.out.println(name + " starts barking....");
    }
}

class Cat extends Animal {
    String name;

    public void setName(String s) {
        name = s;
    }

    public void annoy() {
        System.out.println(name + " starts annoying....");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog("Rock");
        Cat c1 = new Cat();
        a1.walk();
        a1.attack();
        d1.setName("Roxy");
        d1.bark();
        d1.walk();
        d1.attack();
        c1.setName("Tulip");
        c1.annoy();
        c1.walk();
        c1.attack();
    }
}
