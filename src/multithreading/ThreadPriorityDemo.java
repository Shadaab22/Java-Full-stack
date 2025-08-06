package multithreading;

public class ThreadPriorityDemo {
    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " started (priority: " + getPriority() + ")");
            // Simulate some work
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is working: " + i);
                try {
                    Thread.sleep(100); // sleep to allow context switch
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(getName() + " finished.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread("Thread-MAX");
        MyThread thread2 = new MyThread("Thread-MIN");
        MyThread thread3 = new MyThread("Thread-NORM");

        thread1.setPriority(Thread.MAX_PRIORITY);  // 10
        thread2.setPriority(Thread.MIN_PRIORITY);  // 1
        thread3.setPriority(Thread.NORM_PRIORITY); // 5

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to complete
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("All threads completed.");
    }
}
