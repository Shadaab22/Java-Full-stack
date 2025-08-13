/*
 * write a function that takes to 2 numbers in string for me and forms a string containing the sum of these two numbers. a string containing the sum of these two numbers
 * Assumptions :
 * The input strings will contain only numeric digits.
 * The input strings can be of any large lengths.
 * The lengths of the two input string need not be the same.
 * The input strings will represent only positive numbers.
 * For example -
 * If input strings are "1234" and "56" the output strings should be "1290"
 * If input strings are "123456732128989543219" send "987612673489652" the output string should be "123457719741663032871".
 * Note :
 * In Java find C# this logic can be easily implemented using BigInteger however for the sake of enhancing your programming skills you are recommended to solve this question without using BigInteger.
 */
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