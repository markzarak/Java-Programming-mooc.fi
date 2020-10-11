/*
 * Calculating the Return Value Inside a Method
 * @author: Mark Zarak, Oct 2020
 */

public class Averaging {

    // Calculating sum
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
    // Calculating average
    public static double average(int number1, int number2, int number3, int number4) { 
        return sum(number1, number2, number3, number4) / 4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
