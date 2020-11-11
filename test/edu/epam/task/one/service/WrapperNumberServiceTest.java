package edu.epam.task.one.service;

import edu.epam.task.one.entity.WrapperNumber;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WrapperNumberServiceTest {

    @Test
    public void checkEqual() {
        WrapperNumber number = new WrapperNumber(12);
        WrapperNumberService service = new WrapperNumberService();
        WrapperNumber actualResult = service.getLastDigitOf2ndPowerNum(number);
        WrapperNumber expectedResult = new WrapperNumber(4);
        assertEquals(actualResult, expectedResult);
    }
}
