package fundamentals;

import java.util.Arrays;

public class EvenOddStablePartition {
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = nums.length - 1;

        for (int n : nums) {
            if (n % 2 == 0)
                result[evenIdx++] = n;
        }
        for (int n : nums) {
            if (n % 2 != 0)
                result[oddIdx++] = n;
        }
        return result;
    }

    // Alternative: If you want to maintain relative order among even & odd numbers:
    /*
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0;
        for (int n : nums) if (n % 2 == 0) result[idx++] = n;
        for (int n : nums) if (n % 2 != 0) result[idx++] = n;
        return result;
    }
    */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOdd(new int[]{1,0,1,0,0,1,1,1}))); // [0, 0, 0, 1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2, 1})));       // [2, 3, 3, 1]
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2})) );            // [2, 2]
    }
}
