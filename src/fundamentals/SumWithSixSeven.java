package fundamentals;

public class SumWithSixSeven {
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean skip = false;
        for (int n : nums) {
            if (n == 6) {
                skip = true;        // Start skipping
            } else if (skip && n == 7) {
                skip = false;       // Stop skipping after 7
            } else if (!skip) {
                sum += n;           // Add if not skipping
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {10,3,6,1,2,7,9};
        System.out.println("O/P: " + sum67(arr1)); // Output: 22

        // Example 2
        int[] arr2 = {7,1,2,3,6};
        System.out.println("O/P: " + sum67(arr2)); // Output: 19

        // Example 3
        int[] arr3 = {1,6,4,7,9};
        System.out.println("O/P: " + sum67(arr3)); // Output: 10
    }
}
