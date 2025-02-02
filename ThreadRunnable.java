// Creating a Java Thread Using Runnable Interface
// Don't run infinite while loop present

class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        // bullet1.start(); Not allowed
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        // bullet2.start(); Not allowed
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
