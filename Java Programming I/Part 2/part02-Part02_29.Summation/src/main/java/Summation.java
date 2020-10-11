/*
 * Calculating the Return Value Inside a Method
 * @author: Mark Zarak, Oct 2020
 */

public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
}
