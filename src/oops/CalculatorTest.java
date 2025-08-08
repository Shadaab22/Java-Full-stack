package oops;

public class CalculatorTest {
    public static void main(String[] args) {
        // Test powerInt
        int resultInt = Calculator.powerInt(2, 3);
        System.out.println("2^3 (int): " + resultInt);

        // Test powerDouble
        double resultDouble = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5^3 (double): " + resultDouble);
    }
}
