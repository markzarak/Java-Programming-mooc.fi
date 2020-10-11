/*
 * Calculating the Return Value Inside a Method
 * @author: Mark Zarak, Oct 2020
 */

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
