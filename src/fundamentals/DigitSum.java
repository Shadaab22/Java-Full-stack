package fundamentals;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("I/P: ");
        int num = sc.nextInt();

        int sum = 0, n = num;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("O/P: " + sum);
      sc.close();
    }
}
