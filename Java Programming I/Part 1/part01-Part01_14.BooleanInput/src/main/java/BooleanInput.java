/*
 * Reading Booleans
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        boolean reply = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + reply);

    }
}
