package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToOneThenZero() {
        int rsl = Counter.sumByEven(0, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromMinusTwoToFourThenFour() {
        int rsl = Counter.sumByEven(-2, 4);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}