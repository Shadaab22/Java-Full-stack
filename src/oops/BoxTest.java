package oops;

public class BoxTest {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java oops.BoxTest <width> <height> <depth>");
            return;
        }

        try {
            double width = Double.parseDouble(args[0]);
            double height = Double.parseDouble(args[1]);
            double depth = Double.parseDouble(args[2]);

            Box box = new Box(width, height, depth);
            System.out.println("Volume of the box: " + box.getVolume());
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numeric values.");
        }
    }
}
