package fundamentals;

import java.util.Scanner;

public class LastDigitChecker {

    public static boolean lastDigit(int a, int b) {
        return (Math.abs(a) % 10) == (Math.abs(b) % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(lastDigit(num1, num2));
        scanner.close();
    }
}
