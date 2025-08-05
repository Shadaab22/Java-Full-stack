package fundamentals;

public class Sample1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two integers as command line arguments.");
            return;
        }
        // Convert string arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}

