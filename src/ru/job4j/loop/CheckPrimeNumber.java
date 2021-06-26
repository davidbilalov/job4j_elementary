package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumber {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckNumber.check(number);
        Assert.assertTrue(result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckNumber.check(number);
        Assert.assertTrue(result);
    }
}
