package logicbuilding.day2;
import java.util.*;

public class Odd {
  public static int isOdd(int num){
    if (num % 2 != 0){
      return 2;
    }
    else{
      return 1;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println(isOdd(num));
    sc.close();
  }
}
