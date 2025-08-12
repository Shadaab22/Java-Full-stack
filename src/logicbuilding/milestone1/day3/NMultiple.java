package logicbuilding.milestone1.day3;
import java.util.*;

public class NMultiple {
  public static int isMultiple(int num1, int num2){
    if (num1 == 0 || num2 == 0){
      return 3;
    }
    else if (num1 % num2 == 0){
      return 2;
    }
    else{
      return 1;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a first number : ");
    int num1 = sc.nextInt();

    System.out.print("Enter a first number : ");
    int num2 = sc.nextInt();

    System.out.println(isMultiple(num1, num2));

    sc.close();
  }
}
