/*
 * Array as a parameter of a method
 * @author: Mark Zarak, Oct 2020
 */

public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num : array) {
            for (int i = 0; i < num; ++i) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
