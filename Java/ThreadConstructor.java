import java.util.*;

class Thread1 extends Thread {
    
    Thread1(String name) { // constructor used to give a name to thread
        super(name);
    }
    public void run() {
        int i = 0;

        while(i < 10) {
            System.out.println("Thread 1");

            i += 1;
        }
    }
}
class Firstclass {
    public static void main(String args[]) {

        Thread1 t1 = new Thread1("Tony Stark"); // set thread name

        t1.start();

        System.out.println(t1.getId()); // get thread id
        System.out.println(t1.getName()); // get thread name
    }
}
