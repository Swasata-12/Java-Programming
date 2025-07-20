class A2 {
    public void show() {
        System.out.println("In A2 show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A2 obj = new A2() {
            public void show() {
                System.out.println("I am new show");
            }
        };
        obj.show();
    }
}
