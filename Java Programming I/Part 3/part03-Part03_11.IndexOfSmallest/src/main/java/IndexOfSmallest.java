/*
 * Iterating Over a List Continued
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");

        // Find smallest number given
        int smallestNum = list.get(0);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) < smallestNum) {
                smallestNum = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallestNum);

        // Search index for number
        for (int i = 0; i < list.size(); ++i) {
            if (smallestNum == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
