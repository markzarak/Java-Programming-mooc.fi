/*
 * Multiple Parameters
 * @author: Mark Zarak, Oct 2020
 */

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            boolean divisibleByThree = beginning % 3 == 0;
            if (divisibleByThree) {
                System.out.println(beginning);
            }
            beginning++;
        }
    }
}
