import java.util.Scanner;


public class InputValidation {

    /** Write a program that prompts user for an integer between 0-10 or 90-100.
     * The program shall read the input as int; and repeat until the user enters a valid input.
     * For examples,
     * Enter a number between 0-10 or 90-100: -1
     * Invalid input, try again...
     * Enter a number between 0-10 or 90-100: 50
     * Invalid input, try again...
     * Enter a number between 0-10 or 90-100: 101
     * Invalid input, try again...
     * Enter a number between 0-10 or 90-100: 95
     * You have entered: 95
     */

    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0-10 or 90-100:");

        System.out.println(askNumber(in));

    }

    public static String askNumber(Scanner in) {
        int i = in.nextInt();
        if (String.valueOf(i).matches("[0-9]|10|9[0-9]|100"))
            return "You have entered: " + i;
        System.out.println("Invalid input, try again...");
        return askNumber(in);
    }

}
