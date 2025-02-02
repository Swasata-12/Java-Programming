class Base {
    Base() {
        System.out.println("I am a constructor");
    }

    Base(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived extends Base {
    Derived() {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of ChildOfDerived with value of z as: " + z);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived();
        // ChildOfDerived cd = new ChildOfDerived();
        // Derived d = new Derived(14, 9);
        // ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
