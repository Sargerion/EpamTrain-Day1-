package edu.epam.task.eight.entity;

import java.util.Objects;

public class WrapperNumber {
    private int number;

    public WrapperNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperNumber that = (WrapperNumber) o;
        return number == that.number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WrapperNumber{");
        sb.append("number = ").append(number).append("}");
        return sb.toString();
    }
}
