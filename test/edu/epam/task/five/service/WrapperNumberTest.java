package edu.epam.task.five.service;

import edu.epam.task.five.service.WrapperNumberService;
import edu.epam.task.one.entity.WrapperNumber;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WrapperNumberTest {
    @Test
    public void checkPerfectTrue() {
        WrapperNumber number = new WrapperNumber(6);
        WrapperNumberService service = new WrapperNumberService();
        boolean actualResult = service.isPerfect(number);
        assertTrue(actualResult);
    }

    @Test
    public void checkPerfectFalse() {
        WrapperNumber number = new WrapperNumber(5);
        WrapperNumberService service = new WrapperNumberService();
        boolean actualResult = service.isPerfect(number);
        assertFalse(actualResult);
    }
}
