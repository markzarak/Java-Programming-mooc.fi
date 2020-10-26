/*
 * Data of Fixed Format
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            // If user input is empty, then exit
            if (userInput.equals("")) {
                break;
            }
            // Create an array that holds each word, using space as the delimiter
            String[] lines = userInput.split(" ");
            // Print the first word
            System.out.println(lines[0]);
        }
    }
}
