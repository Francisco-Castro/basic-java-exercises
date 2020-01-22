import java.util.stream.IntStream;

public class HarmonicSum {

    /**
     * Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000.
     * The program shall compute the sum from left-to-right as well as from the right-to-left.
     * Are the two sums the same? Obtain the absolute difference between these two sums and explain the difference.
     * Which sum is more accurate?
     */

    public static void main(String[] args) {

        // Define variables
        int start = 1;
        int maxDenominator = 50000;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums


        double sum = IntStream.rangeClosed(1, maxDenominator)
                .mapToDouble(num -> (1.0 / (double) num) )
                .sum();

        System.out.println(sum);

        double sumR = IntStream.rangeClosed(1, maxDenominator)
                .map(i -> start + (maxDenominator - i))
                .mapToDouble(num -> (1.0 / (double) num) )
                .sum();

        System.out.println(sumR);

    }

}
