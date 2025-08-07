package fundamentals;

public class ArgumentsChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Print all arguments separated by comma
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                // Print comma after each arg except the last one
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
        }
    }
}
