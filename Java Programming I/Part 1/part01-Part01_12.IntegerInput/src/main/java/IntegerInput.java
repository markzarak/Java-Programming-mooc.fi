/*
 * Reading Integers
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int reply = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + reply);

    }
}
