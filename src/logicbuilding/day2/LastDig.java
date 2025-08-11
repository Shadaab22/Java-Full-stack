package logicbuilding.day2;
import java.util.*;

public class LastDig {
  public static int isLast(int num){
    num = Math.abs(num);
    if (num<10){
      return num;
    }
    else{
      int dig = num % 10;
      return dig;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println(isLast(num));
    sc.close();
  }
}
