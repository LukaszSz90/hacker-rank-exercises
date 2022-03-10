package solved.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year) {

        DayOfWeek getDay = LocalDate.of(year, month, day).getDayOfWeek();

        return getDay + "";
    }
}
