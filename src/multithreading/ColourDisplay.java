package multithreading;
import java.util.Random;

public class ColourDisplay implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            int idx = rand.nextInt(colours.length);
            String colour = colours[idx];
            System.out.println("Colour: " + colour);
            if (colour.equalsIgnoreCase("red")) {
                System.out.println("Red found! Stopping display.");
                break;
            }
            try {
                Thread.sleep(500); // optional: slow down display for clarity
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        ColourDisplay cd = new ColourDisplay();
        Thread t = new Thread(cd);
        t.start();
    }
}
