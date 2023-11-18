import java.util.*;

class Thread1 extends Thread {
    
    Thread1(String name) { // constructor used to give a name to thread
        super(name);
    }
    public void run() {
        System.out.println("priorites " + this.getName());
    }
}
class Firstclass {
    public static void main(String args[]) {

        Thread1 t1 = new Thread1("a"); // set thread name
        Thread1 t2 = new Thread1("b");
        Thread1 t3 = new Thread1("c");
        Thread1 t4 = new Thread1("d");
        Thread1 t5 = new Thread1("e");

        // set priorites of thread
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
