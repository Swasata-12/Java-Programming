// Constructors from Thread class in Java
// Below are the commonly used constructors of the thread class: 
// Thread ( ) 
// Thread ( string ) 
// Thread ( Runnable r )
// Thread ( Runnable r, String name ) 
class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thank You! " + this.getName());
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Chandr");
        t1.start();
        t2.start();
        // System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        // System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
