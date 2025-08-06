package multithreading;

public class EvenOddThreads {
    public static void main(String[] args) {
        // Thread to print even numbers
        Thread evenThread = new Thread(() -> {
            System.out.println("Even Numbers:");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // for new line
        });

        // Thread to print odd numbers
        Thread oddThread = new Thread(() -> {
            System.out.println("Odd Numbers:");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // for new line
        });

        evenThread.start();
        try {
            evenThread.join();  // Wait for evenThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
        try {
            oddThread.join();   // (Optional) Wait for oddThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
