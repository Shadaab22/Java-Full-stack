package fundamentals;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Arrays.sort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
