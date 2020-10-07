/*
 * Calculating
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        int squared = num * num;
        System.out.println(squared);
    }
}
