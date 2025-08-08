package oops;

public class Calculator {

    // Returns num1 raised to the power num2 (int)
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Returns num1 raised to the power num2 (double)
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
