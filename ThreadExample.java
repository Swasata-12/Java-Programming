// Creating a thread by extending Thread class 
// Don't run infinite while loop present

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        // System.out.println(t1.getName());
        try {
            t1.join(); // Method of Thread class
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        // t1.getName();
    }
}
