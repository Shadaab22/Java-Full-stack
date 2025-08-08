package fundamentals;

public class SumAverageArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 34, 56, 7};
        int sum = 0;
        for (int n : arr)
            sum += n;
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
