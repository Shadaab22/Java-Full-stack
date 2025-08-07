package fundamentals;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("I/P: ");
        int num = sc.nextInt();

        int reversed = 0;
        int original = num; // Store original for output, if needed

        while (original != 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original = original / 10;
        }
        System.out.println("O/P: " + reversed);
      sc.close();
    }
}
