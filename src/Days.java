public enum Days {

    Sunday(0),
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6);

    private final Integer day;

    public Integer getDay() {
        return day;
    }

    Days(Integer day) {
        this.day = day;
    }

    public static String getEnumByInteger(Integer code) {
        for (Days d : Days.values()) {
            if (d.day.equals(code)) return d.name();
        }
        return "Not a valid day";
    }

}
