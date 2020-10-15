/*
 * Iterating Over a List with a For-Each Loop
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add user input to ArrayList 
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        // Calculate sum of ArrayList using for-each loop
        int sum = 0;
        for (int listItem : list) {
            sum+= listItem;
        }
        System.out.println("Sum: " + sum);
    }
}
