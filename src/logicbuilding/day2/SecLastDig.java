package logicbuilding.day2;

import java.util.Scanner;

public class SecLastDig {
  public static int isSecLast(int num){
    num = Math.abs(num);
    if (num<10){
      return -1;
    }
    else{
      int dig = num / 10;
      int secdig = dig % 10;
      return secdig;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println(isSecLast(num));
    sc.close();
  }
}
