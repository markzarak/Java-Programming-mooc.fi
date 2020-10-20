/*
 * Reading and Printing Strings
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = scanner.nextLine();
        
        // Print word
        System.out.print(word);
        System.out.print(word);
        System.out.print(word);

    }
}
