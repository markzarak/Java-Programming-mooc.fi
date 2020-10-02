/*
 * Division
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double num2 = Integer.valueOf(scanner.nextLine());

        double avg = (num1 + num2) / 2;
        System.out.println("The average is " + avg);

    }
}
