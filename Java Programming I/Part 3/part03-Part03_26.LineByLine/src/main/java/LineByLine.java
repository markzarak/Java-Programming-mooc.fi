/*
 * Splitting a String
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class LineByLine {

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
        for (String line : lines) {
            System.out.println(line);
        }
        }
    }
}
