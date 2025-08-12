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

