package edu.epam.task.three.entity;

public class Square {
    private double area;

    public Square(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("area = ").append(area).append("}");
        return sb.toString();
    }
}
