package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
public class MonoVerticalTest {
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MonoVertical.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}
