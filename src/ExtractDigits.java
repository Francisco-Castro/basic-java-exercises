import java.util.Arrays;
import java.util.stream.Collectors;

public class ExtractDigits {

    /** Write a program called ExtractDigits to extract each digit from an int, in the reverse order.
     * For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.
     */
    public static void main(String[] args) {

        int number = 15423;

        String collect = String.join(" ", ("" + number).split(""));

        System.out.println(collect);


    }
}
