/*
 * Calculating the Return Value Inside a Method
 * @author: Mark Zarak, Oct 2020
 */

public class Smallest {

    public static int smallest(int number1, int number2) {
        int smallest = number1;
        if (number2 < number1 ) {
            smallest = number2;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
