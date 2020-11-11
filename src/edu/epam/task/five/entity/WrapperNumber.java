package edu.epam.task.five.entity;

public class WrapperNumber {

    private int number;

    public WrapperNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WrapperNumber{");
        sb.append("number = ").append(number).append("}");
        return sb.toString();
    }
}
