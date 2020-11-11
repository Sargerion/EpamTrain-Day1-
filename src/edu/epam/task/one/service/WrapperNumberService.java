package edu.epam.task.one.service;

import edu.epam.task.one.entity.WrapperNumber;

public class WrapperNumberService {
    public WrapperNumber getLastDigitOf2ndPowerNum(WrapperNumber number) {
        WrapperNumber lastDigit = number.getLastDigit();
        WrapperNumber secondPowOfLastDigit = lastDigit.getSecondPow();
        return secondPowOfLastDigit.getLastDigit();
    }
}
