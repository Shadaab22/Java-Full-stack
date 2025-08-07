package fundamentals;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two characters
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);

        // Compare and print in alphabetical order
        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else if (ch2 < ch1) {
            System.out.println(ch2 + "," + ch1);
        } else {
            // If both characters are same
            System.out.println(ch1 + "," + ch2);
        }
      scanner.close();
    }
}
