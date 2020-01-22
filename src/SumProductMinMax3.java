import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class SumProductMinMax3 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        list.add(in.nextInt());
        System.out.println("Enter 2nd number");
        list.add(in.nextInt());
        System.out.println("Enter 3rd number");
        list.add(in.nextInt());

        Integer sum = list.stream()
                .reduce(0, Integer::sum);

        Integer max = list.stream()
                .max(Integer::compareTo).get();

        Integer min = list.stream()
                .min(Integer::compareTo).get();

        Integer prod = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.printf("The sum is: %d\n", sum);
        System.out.printf("The product is: %d\n", prod);
        System.out.printf("The max is: %d\n", max);
        System.out.printf("The min is: %d\n", min);

        in.close();


    }

}
