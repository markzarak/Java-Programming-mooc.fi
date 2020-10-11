/*
 * Method Calling Another Method
 * @author: Mark Zarak, Oct 2020
 */

public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size;
        for (int i = 1; i <= size; ++i) {
            printSpaces(spaces - 1);
            printStars(i);
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        // print christmas tree top
        int spaces = height;
        int stars = 0;
        for (int i = 1; i <= height; ++i) {
            printSpaces(spaces - 1);
            printStars(i + stars);
            spaces--;
            stars++;
        }
        // print christmas tree bottom
        printSpaces(stars -2);
        printStars(3);
        printSpaces(stars -2);
        printStars(3);
    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
