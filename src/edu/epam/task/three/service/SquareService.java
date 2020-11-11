package edu.epam.task.three.service;

import edu.epam.task.three.entity.Square;

public class SquareService {

    private double getSideFromArea(Square square) {
        return Math.sqrt(square.getArea());
    }

    public double getAreaOfInsideSquare(Square outSquare) {
        SquareService service = new SquareService();
        double sideOfInsideSquare = Math.round(service.getSideFromArea(outSquare) / Math.sqrt(2));
        return Math.pow(sideOfInsideSquare, 2);
    }

    public double compareAreas(Square inSquare, Square outSquare) {
        return Math.round(outSquare.getArea() / inSquare.getArea());
    }
}
