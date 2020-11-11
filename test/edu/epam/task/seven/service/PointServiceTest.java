package edu.epam.task.seven.service;

import edu.epam.task.seven.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    @Test
    public void checkEquals() {
        Point a = new Point(3,4);
        Point b = new Point(6, 8);
        PointService service = new PointService();
        Point actualResult = service.getCloserPoint(a, b);
        assertEquals(actualResult, a);
    }
}
