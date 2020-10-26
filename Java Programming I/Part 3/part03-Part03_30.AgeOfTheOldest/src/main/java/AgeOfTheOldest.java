/*
 * Using Diverse Text
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        while (true) {
            String userInput = scanner.nextLine();
            // If user input is empty, then exit
            if (userInput.equals("")) {
                break;
            }
            // Create an array that holds each value, using comma as the delimiter
            String[] lines = userInput.split(",");
            // Convert String to Integer
            int age = Integer.valueOf(lines[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        // Print the oldest
        System.out.println("Age of the oldest: " + oldest);
    }
}
