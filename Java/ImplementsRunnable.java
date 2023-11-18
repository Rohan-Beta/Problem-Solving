import java.util.*;

class Thread1 implements Runnable {

    public void run() {
        int i = 0;

        while(i < 10) {
            System.out.println("thread 1");
            System.out.println("hello");

            i += 1;
        }
    }
}
class Thread2 implements Runnable {

    public void run() {
        int i = 0;

        while(i < 10) {
            System.out.println("thread 2");
            System.out.println("hii");

            i += 1;
        }
    }
}
class Firstclass {
    public static void main(String args[]) {

        Thread1 bullet1 = new Thread1();
        Thread gun1 = new Thread(bullet1);

        Thread2 bullet2 = new Thread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
