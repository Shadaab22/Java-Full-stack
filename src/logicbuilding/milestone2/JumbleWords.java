package logicbuilding.milestone2;
import java.util.*;

public class JumbleWords {
  public static void isJumble(String input1, int input2){
    String[] words = input1.split(" ");

    StringBuilder evenChars = new StringBuilder();
    StringBuilder oddChars = new StringBuilder();
    StringBuilder jumblesent1 = new StringBuilder();
    StringBuilder jumblesent2 = new StringBuilder();

    for (String word : words){

      evenChars.setLength(0);
      oddChars.setLength(0);
      String reverse = "";

      for (int i=0; i<word.length(); i=i+2){
        evenChars.append(word.charAt(i));
      }

      for (int i=1; i<word.length(); i=i+2){
        oddChars.append(word.charAt(i));
      }

      for (int i=oddChars.length()-1; i>=0; i--){
        reverse += oddChars.charAt(i);
      }

      jumblesent1.append(evenChars.toString() + oddChars.toString());
      jumblesent1.append(" ");

      jumblesent2.append(evenChars.toString() + reverse);
      jumblesent2.append(" ");

    }

    if(input2 == 1){
      System.out.println(jumblesent1);
    }
    else if (input2 == 2){
      System.out.println(jumblesent2);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence : ");
    String input1 = sc.nextLine();

    System.out.print("Enter a method : ");
    int input2 = sc.nextInt();

    isJumble(input1, input2);

    sc.close();
  }
}