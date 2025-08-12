package logicbuilding.milestone1.day3;

import java.util.Scanner;

public class OddCount {
  public static int oddCount(int num1, int num2, int num3, int num4, int num5){
    int[] nums = {num1, num2, num3, num4, num5};
    int count=0;

    for (int num : nums){
      if (num % 2 != 0){
        count++;
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

    System.out.println(oddCount(num1, num2, num3, num4, num5));

    sc.close();
  }
}
