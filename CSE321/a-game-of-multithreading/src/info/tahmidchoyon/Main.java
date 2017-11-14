package info.tahmidchoyon;

import info.tahmidchoyon.model.Process;

public class Main {

    public static void main(String[] args) {

        Thread p1 = new Thread(new Process("One"));
        Thread p2 = new Thread(new Process("Two"));
        Thread p3 = new Thread(new Process("Three"));
        Thread p4 = new Thread(new Process("Four"));
        Thread p5 = new Thread(new Process("Five"));

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(8);
        p3.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(3);
        p3.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
