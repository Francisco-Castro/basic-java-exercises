import java.util.Arrays;
import java.util.List;

public class PrintDayInWord {

    /**
     * Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday”
     * if the int variable "dayNumber" is 0, 1, ..., 6, respectively.
     * Otherwise, it shall print "Not a valid day". Use
     * (a) a "nested-if" statement;
     * (b) a "switch-case-default" statement.
     *
     * Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
     * */


    public static void main(String[] args) {

        List<Integer> dayNumbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);


//        Arrays.stream(Days.values())
//                .map(day -> day.getDay() + " " + day.name())
//                .forEach(System.out::println);

        dayNumbers.stream()
                .map(Days::getEnumByInteger)
                .forEach(System.out::println);


    }
}
