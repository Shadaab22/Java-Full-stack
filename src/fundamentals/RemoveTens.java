package fundamentals;

import java.util.Arrays;

public class RemoveTens {
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int n : nums) {
            if (n != 10) {
                result[index++] = n;
            }
        }
        // Remaining places are already initialized to 0
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        printArray(withoutTen(new int[]{1, 10, 10, 2}));
        printArray(withoutTen(new int[]{10, 2, 10}));
        printArray(withoutTen(new int[]{1, 99, 10}));
    }
}
