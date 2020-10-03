/*
 * Conditional Statement Expression and the Boolean Variable
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        boolean even = num % 2 == 0;
        if (even) {
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Number " + num + " is odd.");
        }
    }
}
