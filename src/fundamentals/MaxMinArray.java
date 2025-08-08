package fundamentals;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 34, 56, 7};
        int max = arr[0], min = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
