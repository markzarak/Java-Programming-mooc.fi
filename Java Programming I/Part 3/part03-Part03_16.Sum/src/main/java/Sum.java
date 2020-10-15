/*
 * List as a Method Parameter
 * @author: Mark Zarak, Oct 2020
 */

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Input numbers to ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    // Calculate sum of ArrayList
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
