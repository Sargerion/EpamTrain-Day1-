package edu.epam.task.eight.service;

import edu.epam.task.eight.entity.WrapperNumber;

public class WrapperNumberService {

    public double findFunctionValue(WrapperNumber number) {
        double argument = number.getNumber();
        return number.getNumber() >= 3 ? (-Math.pow(argument, 2) + 3 * argument + 9) : (1 / (Math.pow(argument, 3) - 6));
    }
}
