public class PrintNumberInWord {

    /**
     * Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
     * if the int variable "number" is 1, 2,... , 9, or other, respectively.
     * Use:
     * (a) a "nested-if" statement;
     * (b) a "switch-case-default" statement.
     * (c) MY case using ENUMS
     */

    private enum Numbers {
        ONE(1, "I"), TWO(2, "II"), THREE(3, "III"), FOUR(4, "IV");

        private final Integer number;
        private final String roman;

        public Integer getInteger() {
            return number;
        }

        public String getRoman() {
            return roman;
        }

        Numbers(Integer number, String roman) {
            this.number = number;
            this.roman = roman;
        }
    }

    public static void main(String[] args) {

        Numbers[] values = Numbers.values();

        for (Numbers value : values) {
            System.out.println(value.name() + " " + value.getInteger() + " " + value.getRoman());
        }

    }

}
