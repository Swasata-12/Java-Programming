class A1 {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class B1 {
        public void config() {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A1 obj = new A1();
        A1.B1 obj1 = obj.new B1(); // if the class B1 static then we can do new A1.B1();
        obj.show();
        obj1.config();
    }
}
