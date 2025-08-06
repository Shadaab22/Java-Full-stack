package multithreading;
public class NumberPrinter {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    try {
                        Thread.sleep(5000); // 5 seconds = 5000 milliseconds
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
