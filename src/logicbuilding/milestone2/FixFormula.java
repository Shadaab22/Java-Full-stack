package logicbuilding.milestone2;
import java.util.*;

public class FixFormula {
  public static int fixTheFormula(String input) {

    char[] ops = new char[input.length()];
    int[] nums = new int[input.length()];
    int opCount = 0, numCount = 0;


    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        ops[opCount++] = ch;
      } 
      else if (ch >= '0' && ch <= '9') {
        nums[numCount++] = ch - '0';
      }
    }


    int result = nums[0];
    for (int i = 0; i < opCount; i++) {
      switch (ops[i]) {
        case '+':
            result += nums[i + 1];
            break;
        case '-':
            result -= nums[i + 1];
            break;
        case '*':
            result *= nums[i + 1];
            break;
        case '/':
            result /= nums[i + 1];
            break;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a question : ");
    String input = sc.nextLine();

    System.out.println(fixTheFormula(input));
    sc.close();
    // System.out.println(fixTheFormula("ve8+you2-7to/*32")); // Output: 2
    // System.out.println(fixTheFormula("1=+t5s-8th14birdS")); // Output: 35
    // System.out.println(fixTheFormula("Fo+23the3*like2=")); // Output: 17
  }
}
