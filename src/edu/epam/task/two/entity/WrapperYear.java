package edu.epam.task.two.entity;

public class WrapperYear {

    private int year;
    private int month;

    public WrapperYear(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public boolean isLeap() {
        return year % 4 == 0 || (year % 100 != 0 && year % 400 == 0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyYear{");
        sb.append("year = ").append(year).append(" month = ").append(month).append("}");
        return sb.toString();
    }
}
