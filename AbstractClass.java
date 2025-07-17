abstract class Parent {
    public Parent() {
        System.out.println("Mai Parent ka constructor hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    public void sayBye() {
        System.out.println("Good Bye...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Parent p = new Parent(); not allowed
        Child c = new Child();
        Parent p = new Child();
        c.sayHello();
        c.greet();
        c.sayBye();
        p.sayHello();
        p.greet();
        // p.sayBye();  not allow Dynamic method dispatch
    }
}
