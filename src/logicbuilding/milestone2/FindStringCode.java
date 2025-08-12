/*
 * Find String Code
 * Crazy Zak has designed the below steps which can be applied on any given string (sentences) to produce a number.
 * STEP 1: In each word find the sum of the difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
 * STEP 2: Concatenate the sums of each word to form the result.
 * For example : 
 * If the given sentence is "WORLD WIDE WEB"
 * STEP 1:
 * WORLD = [W - D]+[O - L]+[R] = [23 - 4]+[15 - 12]+[18] = [19]+[3]+[18] = [40]
 * WIDE = [W - E]+[I - D] = [23 - 5]+[9 - 4] = [18]+[5] = [23]
 * WEB = [W - B]+[E] = [23 - 2]+[5] = [21]+[5] = [26]
 * STEP 2:
 * [40][23][26]
 * [402326]
 * Note : This is not case sensitive 'A' and 'a' should have same value 1, as in alphabetical order 'A'=1 - - - 'Z'=26.
 */
package logicbuilding.milestone2;
import java.util.*;

public class FindStringCode {
  public static int wordSum(String sentence){
    sentence = sentence.toUpperCase();
    String[] words = sentence.split("\\s+");
    StringBuilder result = new StringBuilder();

    for (String word : words){
      int left = 0;
      int right = word.length() - 1;
      int sum = 0;

      while(left < right){
        int leftVal = word.charAt(left)-'A'+1;
        int rightVal = word.charAt(right)-'A'+1;
        sum += Math.abs(leftVal - rightVal);
        left++;
        right--;
      }

      if(left == right){
        sum += word.charAt(left)-'A'+1;
      }
      result.append(sum);
    }
    return Integer.parseInt(result.toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String sentence = sc.nextLine();
    System.out.println(wordSum(sentence));
    
    sc.close();
  }
}
