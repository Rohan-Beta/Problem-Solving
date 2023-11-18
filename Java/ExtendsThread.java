import java.util.*;

class Thread1 extends Thread {

    public void run() {

        int i = 0;

        while(i < 10) {

            System.out.println("Thread 1");
            System.out.println("happy");

            i += 1;
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        int i = 0;

        while(i < 10) {
            System.out.println("Thread 2");
            System.out.println("sad");

            i += 1;
        }
    }
}
class Firstclass {
    public static void main(String args[]) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
