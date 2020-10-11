/*
 * Multiple Parameters
 * @author: Mark Zarak, Oct 2020
 */

public class Division {

    public static void main(String[] args) {
        division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        if (denominator != 0) {
            float sum = (float) numerator / denominator;
            System.out.println(sum);
        }
    }
}
