/*
 * Different Types of Input
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + num1);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + trueOrFalse);

    }
}
