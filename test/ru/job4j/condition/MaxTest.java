package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To0Then5() {
        int result = Max.max(5, 0);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3To10Then10() {
        int result = Max.max(3, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}