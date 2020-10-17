/*
 * Array as a parameter of a method
 * @author: Mark Zarak, Oct 2020
 */

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            // Print number
            System.out.print(array[i]);
            // Print comma and space except for last number
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
