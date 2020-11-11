package edu.epam.task.seven.service;

import edu.epam.task.seven.entity.Point;

public class PointService {
    public Point getCloserPoint(Point a, Point b) {
        double distAToZero = Math.hypot(a.getX(), a.getY());
        double distBToZero = Math.hypot(b.getX(), b.getY());
        if (distAToZero <= distBToZero) {
            return a;
        } else {
            return b;
        }
    }
}
