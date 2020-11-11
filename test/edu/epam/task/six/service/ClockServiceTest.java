package edu.epam.task.six.service;

import edu.epam.task.six.entity.Clock;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClockServiceTest {

    @Test
    public void equalTest() {
        Clock clock = new Clock(86400);
        ClockService service = new ClockService();
        int seconds = clock.getSeconds();
        int minutes = service.getMinutes(seconds);
        int hours = service.getHours(seconds);
        Clock actualResult = new Clock(seconds, minutes, hours);
        Clock expectedResult = new Clock(86400,1440, 24);
        assertEquals(actualResult, expectedResult);
    }
}
