package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double out = Point.distance(0, 0, 2, 0);
        int expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to02then2() {
        double out = Point.distance(0, 1, 0, 2);
        int expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then2() {
        double out = Point.distance(1, 0, 2, 0);
        int expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to90then2() {
        double out = Point.distance(3, 0, 9, 0);
        int expected = 6;
        Assert.assertEquals(expected, out, 0.01);
    }
}