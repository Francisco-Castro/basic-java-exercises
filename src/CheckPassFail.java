import java.util.Arrays;
import java.util.List;

public class CheckPassFail {

    /**
     * Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50;
     * or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
     *
     * Try mark = 0, 49, 50, 51, 100 and verify your results.
     * */
    public static void main(String[] args) {

        // We changed mark for tests so we can evaluate several cases

        List<Integer> tests = Arrays.asList(0, 49, 50, 51, 100);

        tests.stream()
                .map(num -> num >= 50 ? "PASS" : "FAIL")
                .forEach(System.out::println);

        System.out.println("DONE");

    }
}
