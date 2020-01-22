import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;

public class Product1ToN {

    /**
     * Write a program called Product1ToN to compute the product of integers from 1 to 10
     *  (i.e., 1×2×3×...×10), as an int. Take note that It is the same as factorial of N.
     *
     *  HINTS: Factorial of 13
     *
     * */
    public static void main(String[] args) {

        int lowerbound = 1;
        int upperbound = 13;

        OptionalLong answer = IntStream
                .rangeClosed(lowerbound, upperbound)
                .mapToLong(num -> (long) num)
                .reduce((a, b) -> (a * b));

        if (answer.isPresent()) {
            System.out.println(answer.getAsLong());
        }
        else {
            System.out.println("no value");
        }
    }
}
