
// Exercise 26: Thread Creation
class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(message + " " + i);
    }
}

public class Exercise26 {
    public static void main(String[] args) {
        new MyThread("Thread A").start();
        new MyThread("Thread B").start();
    }
}
