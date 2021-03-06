/*
 * Repeating, breaking and remembering
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int count = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            // exit if -1
            if (num == -1) {
                break;
            }
            // track if num is even or odd 
            if (num % 2 == 0) {
                even ++;
            } else {
                odd++;
            }
            count++;
            sum += num;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
