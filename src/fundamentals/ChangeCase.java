package fundamentals;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("i/p:"); 
        char ch = scanner.next().charAt(0);

        // Check and change case
        if (ch >= 'a' && ch <= 'z') {
            char upperCase = (char)(ch - ('a' - 'A'));
            System.out.println(upperCase);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lowerCase = (char)(ch + ('a' - 'A'));
            System.out.println(lowerCase);
        } else {
            System.out.println("o/p: Not an alphabet");
        }
      scanner.close();
    }
}
