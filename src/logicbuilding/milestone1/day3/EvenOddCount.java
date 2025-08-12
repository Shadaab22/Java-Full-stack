package logicbuilding.milestone1.day3;

import java.util.Scanner;

public class EvenOddCount {
  public static int countEvenOdd(int num1, int num2, int num3, int num4, int num5, String input){
    int[] nums = {num1, num2, num3, num4, num5};
    int count=0;

    for (int num : nums){
      if(input.equalsIgnoreCase("even")){
        if(num % 2 == 0){
          count++;
        }
      }
      else if(input.equalsIgnoreCase("odd")){
        if (num % 2 != 0){
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num1 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num2 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num3 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num4 = sc.nextInt();

    System.out.print("Enter a number : ");
    int num5 = sc.nextInt();

    System.out.print("Enter even or odd : ");
    String input = sc.next();

    System.out.println(countEvenOdd(num1, num2, num3, num4, num5, input));

    sc.close();
  }
}
