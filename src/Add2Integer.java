import java.util.Scanner;

public class Add2Integer {

    public static void main(String[] args) {

        // Declare variables
        int num1, num2;
        Scanner in = new Scanner(System.in); // Scan the keyboard for input

        System.out.println("Enter first integer");
        num1 = in.nextInt();

        System.out.println("Enter second integer");
        num2 = in.nextInt();

        System.out.printf("The sum is %d", num1 + num2);

        in.close(); // Close scanner

    }

}
