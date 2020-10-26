/*
 * Splitting a String
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class AVClub {

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
            // Print each word that contains "av"
            for (String line : lines) {
                if (line.contains("av")) {
                    System.out.println(line);
                }
            }
        }
    }
}
