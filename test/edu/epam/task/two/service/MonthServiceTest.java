package edu.epam.task.two.service;

import edu.epam.task.two.entity.WrapperYear;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonthServiceTest {

    @Test
    public void checkDaysInLeapFebruary() {
        WrapperYear leapYear = new WrapperYear(2020, 2);
        MonthService service = new MonthService();
        int actualDaysCount = service.getDaysCount(leapYear);
        int expectedDaysCount = 29;
        assertEquals(actualDaysCount, expectedDaysCount);
    }

    @Test
    public void checkDaysInUsualFebruary() {
        WrapperYear leapYear = new WrapperYear(2019, 2);
        MonthService service = new MonthService();
        int actualDaysCount = service.getDaysCount(leapYear);
        int expectedDaysCount = 28;
        assertEquals(actualDaysCount, expectedDaysCount);
    }
}
