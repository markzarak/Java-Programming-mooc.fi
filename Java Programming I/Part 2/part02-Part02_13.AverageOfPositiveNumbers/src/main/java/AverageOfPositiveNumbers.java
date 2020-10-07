/*
 * Calculation with Loops
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0) {
                sum += num;
                count++;
            } else {
                System.out.println("Cannot calculate the average");
            }
        }
        if (count > 0) {
            System.out.println((double) sum / count);
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
