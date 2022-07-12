package school.mjc.stage0.conditions.finalTask;

import java.time.YearMonth;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (month > 0 && month < 13) {
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth(); //28
            System.out.println(daysInMonth);
        } else {
            System.out.println("invalid date");
        }



    }
}
