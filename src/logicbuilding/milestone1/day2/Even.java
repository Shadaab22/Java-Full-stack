package logicbuilding.milestone1.day2;
import java.util.*;

public class Even {
  public static int isEven(int num){
    if (num % 2 == 0){
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
    System.out.println(isEven(num));
    sc.close();
  }
}
