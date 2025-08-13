/*
 * Farah is one of the few associates in global safe lockers corporation limited, who has access to the company's exclusive locker that holds confidential information related to her division.
 * The pin to the locker gets changed every two days. Farah receives the pin in the form of a string which she needs to decode to get the single digit numeric pin.
 * The numeric key can be obtained by adding the length of each word of the string to get the total length and then continuously adding the digits to the total length till we get a single digit.
 * for example if the string is "Wipro Technologies" the numeric pin will be 8.
 * explanation:
 * length of the word "Wipro" is = 5
 * length of the word "Technologies" is = 12
 * let us add all the length to get the total length equal 5 + 12 = 17 
 * The total length 17 which is not a single digit, so now let us continuously Add all digits till we get a single digit i.e 1 + 7 = 8.
 * Therefore single digit numeric pin = 8. 
 */
package logicbuilding.milestone2;
import java.util.*;

public class CodeByString {
  public static int codeByString(String input1) {
    String[] words = input1.split("\\s+");    
    int totalLength = 0;

    for (String word : words) {
      totalLength += word.length();
    }

    while (totalLength > 9) {
      int sumDigits = 0;
      while (totalLength > 0) {
        sumDigits += totalLength % 10;
        totalLength /= 10;
      }
      totalLength = sumDigits;
    }

    return totalLength;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence : ");
    String input1 = sc.nextLine();

    System.out.println(codeByString(input1));

    sc.close();
  }
}

