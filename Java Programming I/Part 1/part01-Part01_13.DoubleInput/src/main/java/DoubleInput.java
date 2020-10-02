/*
 * Reading Doubles
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double reply = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + reply);

    }
}
