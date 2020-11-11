package edu.epam.task.three.service;

import edu.epam.task.three.entity.Square;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareServiceTest {
    @Test
    public void equalsAreasTest() {
        Square outSquare = new Square(100);
        SquareService service = new SquareService();
        double actualInsideSquareArea = service.getAreaOfInsideSquare(outSquare);
        double expectedInsideSquareArea = 49;
        assertEquals(actualInsideSquareArea, expectedInsideSquareArea);
    }

    @Test
    public void equalsCompareAreasTest() {
        Square outSquare = new Square(100);
        SquareService service = new SquareService();
        double insideSquareArea = service.getAreaOfInsideSquare(outSquare);
        double outsideSquareArea = outSquare.getArea();
        double actualCompareResult = service.compareAreas(new Square(insideSquareArea), outSquare);
        double expectedCompareResult = 2;
        assertEquals(actualCompareResult,expectedCompareResult);
    }
}
