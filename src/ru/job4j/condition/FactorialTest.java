package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int out = Factorial.calc(number);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int out = Factorial.calc(number);
        Assert.assertEquals(expected, out);
    }
}
