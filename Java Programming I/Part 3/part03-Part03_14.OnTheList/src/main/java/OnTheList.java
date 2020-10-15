/*
 * Removing from a List and Checking the Existence of a Value
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter names
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        // Initiate search for name
        System.out.print("Search for? ");
        String nameToSearch = scanner.nextLine();
        boolean found = false;
        for (String name : list) {
            if (name.contains(nameToSearch)) {
                found = true;
            }
        }
        
        // Print result
        if (found) {
            System.out.println(nameToSearch + " was found!");
        } else {
            System.out.println(nameToSearch + " was not found!");
        }
    }
}
