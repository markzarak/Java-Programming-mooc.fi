/*
 * Repeating Functionality
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        // Calculate factorial
        int factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
