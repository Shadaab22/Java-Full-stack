package logicbuilding.milestone2;
import java.util.*;

public class AdditionUsingString {
  public static String addStrings(String input1, String input2) {
    int i = input1.length() - 1;
    int j = input2.length() - 1;
    int carry = 0;
    
    StringBuilder sb = new StringBuilder();

    while (i >= 0 || j >= 0 || carry != 0) {

      int digit1 = (i >= 0) ? input1.charAt(i) - '0' : 0;
      int digit2 = (j >= 0) ? input2.charAt(j) - '0' : 0;

      int sum = digit1 + digit2 + carry;
      sb.append(sum % 10);
      carry = sum / 10;

      i--;
      j--;
    }
    return sb.reverse().toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a word : ");
    String input1 = sc.nextLine();

    System.out.print("Enter a word : ");
    String input2 = sc.nextLine();

    System.out.println(addStrings(input1, input2));

    sc.close();
  }
}