/*
 * String Comparisons And "Equals"
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String userInput = scanner.nextLine();
        
        String stringToMatch = "true";
        if (userInput.equalsIgnoreCase(stringToMatch)) {
            System.out.println("You got it right!)");
        } else {
            System.out.println("Try again!");
        }        
    }
}
