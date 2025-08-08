package fundamentals;

public class Reverse2DArray {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        int[] nums = new int[4];
        try {
            for (int i = 0; i < 4; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter 4 integer numbers.");
            return;
        }

        int[][] arr = {{nums[0], nums[1]}, {nums[2], nums[3]}};

        System.out.println("The given array is :");
        for (int[] row : arr) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }

        // Reverse array elements
        System.out.println("The reverse of the array is :");
        System.out.println(arr[1][1] + " " + arr[1][0]);
        System.out.println(arr[0][1] + " " + arr[0][0]);
    }
}
