class MyName {
    // Constructor 
    public MyName(String s) {
        System.out.println("My name is " + s);
    }

    public void show() {
        System.out.println("I want a job");
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyName obj = new MyName("Swasata Nandy");
        obj.show();
    }
}
