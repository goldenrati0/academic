package info.tahmidchoyon.model;

public class Process implements Runnable {

    private String name;
    private int timer;

    public Process(String name) {
        this.name = name;
        this.timer = 60;
    }

    @Override
    public void run() {
        while (true)
            System.out.println("Now running: ".concat(this.name));
    }
}
