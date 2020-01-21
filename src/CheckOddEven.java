import java.util.Arrays;
import java.util.List;

public class CheckOddEven {

    /**
     * Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
     * or “Even Number” otherwise. The program shall always print “bye!” before exiting.
     *
     * Try number = 0, 1, 88, 99, -1, -2 and verify your results.
     */

    public static void main(String[] args) {

        List<Integer> tests = Arrays.asList(0, 1, 88, 99, -1, -2);

        tests.stream()
                .map(num -> num % 2 == 0 ? "Odd number" : "Even Number" )
                .forEach(System.out::println);

        System.out.println("bye!");

    }
}
