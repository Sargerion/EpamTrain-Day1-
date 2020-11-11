package edu.epam.task.two.report;

import edu.epam.task.two.entity.WrapperYear;

public class MonthReport {
    public void printReport(WrapperYear year, int daysCount) {
        System.out.println(year + "\nAnd count days in this month : " + daysCount);
    }
}
