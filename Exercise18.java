// Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads. Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
// package class_files;
class Thread1 extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome!");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Good Morning!");
    }
}

public class Exercise18 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
