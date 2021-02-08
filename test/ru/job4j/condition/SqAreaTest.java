package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void when6and2then2() {
        double out = SqArea.square(6, 2);
        int expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4and1then1() {
        double out = SqArea.square(4, 1);
        int expected = 1;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when9and1then4() {
        double out = SqArea.square(9, 1);
        int expected = 4;
        Assert.assertEquals(expected, out, 0.01);
    }
}