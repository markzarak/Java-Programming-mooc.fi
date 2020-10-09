/*
 * For Loop
 * @author: Mark Zarak, Oct 2020
 */

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int endNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startNum = Integer.valueOf(scanner.nextLine());
        while (startNum <= endNum){
            System.out.println(startNum);
            startNum++;
        }
    }
}
