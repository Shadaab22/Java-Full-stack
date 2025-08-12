package logicbuilding.milestone1.day2;
import java.util.*;

public class SumLast2Dig {
  public static int addLastDigits(int input1, int input2){
    input1 = Math.abs(input1);
    input2 = Math.abs(input2);

    int dig1 = input1 % 10;
    int dig2 = input2 % 10;

    return dig1 + dig2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int input1 = sc.nextInt();

    System.out.print("Enter a number : ");
    int input2 = sc.nextInt();

    System.out.println(addLastDigits(input1, input2));


    sc.close();
  }
}
