// Don't run infinite while loop present

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        // System.out.println("Thank You " + this.getName());

        int i = 0;
        while (i < 40000) {
            System.out.println("Thank You " + this.getName());
            i++;
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
