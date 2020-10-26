/*
 * Using Diverse Text
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOldest = "";
        int ageOfOldest = -1;
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
            if (age > ageOfOldest) {
                ageOfOldest = age;
                nameOfOldest = lines[0];
            }
        }
        // Print name of the oldest
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
