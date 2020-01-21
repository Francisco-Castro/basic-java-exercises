import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class SumAverageRunningInt {

    /**
     * Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
     * Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.
     * Also compute and display the average.
     * The output shall look like:
     * The sum of 1 to 100 is 5050
     * The average is 50.5
     */

    public static void main(String[] args) {

        int lowerbound = 1;
        int upperbound = 101;

        int sum = IntStream.range(lowerbound, upperbound).sum();
        OptionalDouble average = IntStream.range(lowerbound, upperbound)
                .average();

        System.out.printf("The sum of %d to %d is %d\n", lowerbound, --upperbound, sum);

        if (average.isPresent())
            System.out.printf("The average is %f", average.getAsDouble());
        else System.out.println("-1");

    }

}
