package logicbuilding.milestone1.day1;
import java.util.*;

public class GreaterNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num1 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num2 = sc.nextInt();
    if (num1 > num2){
      System.out.println(num1 + " Is the greatest");
    }
    else{
      System.out.println(num2 + " Is the greatest");
    }
    sc.close();
  }
}
