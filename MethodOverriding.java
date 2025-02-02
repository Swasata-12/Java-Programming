class A {
    public void method1() {
        System.out.println("I am meth1 of class A");
    }

    public void method2() {
        System.out.println("I am meth2 of class A");
    }
}

class B extends A {
    public void method3() {
        System.out.println("I am meth3 of class B");
    }

    @Override
    public void method2() {
        System.out.println("I am meth2 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method1();
        a.method2();
        b.method1();
        b.method2(); // execute method2() of class B
        b.method3();
    }
}
