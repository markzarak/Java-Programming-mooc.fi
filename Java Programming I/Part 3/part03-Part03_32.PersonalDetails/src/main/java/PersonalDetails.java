/*
 * Using Diverse Text
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int name = 0;
        double averageAge = 0;
        int count = 0;
        while (true) {
            String userInput = scanner.nextLine();
            // If user input is empty, then exit
            if (userInput.equals("")) {
                break;
            }
            // Create an array that holds each value, using comma as the delimiter
            String[] lines = userInput.split(",");
            // Convert String to Integer and add to averageAge
            averageAge += Integer.valueOf(lines[1]);
            count++;
            // Find longest name
            if (lines[0].length() > name) {
                name = lines[0].length();
                longestName = lines[0];
            }
        }
        // If count is greater than 0, calculate average and print result
        if (count > 0) {
            averageAge = averageAge / count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + averageAge);
        } else {
            System.out.println("Error: No input");
        }
    }
}
