/*
 * Iterating Over a List with a For-Each Loop
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Add user input to ArrayList 
        ArrayList<Integer> list = new ArrayList();
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        
        // Calculate average of ArrayList using for-each loop
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double avg = (double) sum / list.size();
        System.out.println("Average: " + avg);
    }
}
