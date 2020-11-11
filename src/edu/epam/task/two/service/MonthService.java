package edu.epam.task.two.service;

import edu.epam.task.two.entity.WrapperYear;

public class MonthService {

    private static final int[] USUALDAYS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAPDAYS = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getDaysCount(WrapperYear year) {
        if (year.isLeap()) {
            return LEAPDAYS[year.getMonth() - 1];
        }
        else {
            return USUALDAYS[year.getMonth() - 1];
        }
    }
}
