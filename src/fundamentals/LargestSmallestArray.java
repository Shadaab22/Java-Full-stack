package fundamentals;

import java.util.Arrays;

public class LargestSmallestArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest: " + arr[arr.length-1] + ", " + arr[arr.length-2]);
    }
}
