/*
 * Repeating Functionality
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        // Calculate sum of numbers between first and last
        int sum = 0;
        while (firstNum <= lastNum) {
            sum += firstNum;
            firstNum++;
        }
        System.out.println("The sum is " + sum);
    }
}
