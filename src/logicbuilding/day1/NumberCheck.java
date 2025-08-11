package logicbuilding.day1;
import java.util.*;

public class NumberCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int N = sc.nextInt();
    if(N==0){
      System.out.println("Zero");
    }
    else if(N>0){
      System.out.println("Positive");
    }
    else{
      System.out.println("Negative");
    }
    sc.close();
  }
}
