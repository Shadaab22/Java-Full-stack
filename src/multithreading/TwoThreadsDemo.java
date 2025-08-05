package multithreading;
public class TwoThreadsDemo {
    public static void main(String[] args) {
        // Create first thread with name "Scooby"
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread name is: " + Thread.currentThread().getName());
        }, "Scooby");

        // Create second thread with name "Shaggy"
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread name is: " + Thread.currentThread().getName());
        }, "Shaggy");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

