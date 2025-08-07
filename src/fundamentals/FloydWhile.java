package fundamentals;

import java.util.Scanner;

public class FloydWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter an integer number");
        }
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
      sc.close();
    }
}
