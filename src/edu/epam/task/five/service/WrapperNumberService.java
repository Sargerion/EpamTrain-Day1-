package edu.epam.task.five.service;

import edu.epam.task.one.entity.WrapperNumber;

public class WrapperNumberService {
    public boolean isPerfect(WrapperNumber number) {
        int sum = 0;
        int num = number.getNumber();
        for (int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
