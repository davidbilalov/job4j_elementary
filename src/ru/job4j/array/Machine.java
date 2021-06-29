package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int count = 0;
        int size = 0;
        int dozens = 0;
        int fives = 0;
        int twos = 0;
        int ones = 0;
        money -= price;
        while (money > 0) {
            if (money / 10 > 0) {
                dozens = money / 10;
                money -= dozens * 10;
            }
            if (money / 5 > 0) {
                fives = money / 5;
                money -= fives * 5;
            }
            if (money / 2 > 0) {
                twos = money / 2;
                money -= twos * 2;
            }
            if (money > 0) {
                money -= 1;
                ones++;
            }
        }
        size = dozens + fives + twos + ones;
        while (size > 0) {
            if (dozens > 0) {
                rsl[count] = 10;
                dozens--;
                count++;
            }
            if (fives > 0) {
                rsl[count] = 5;
                fives--;
                count++;
            }
            if (twos > 0) {
                rsl[count] = 2;
                twos--;
                count++;
            }
            if (ones > 0) {
                rsl[count] = 1;
                ones--;
                count++;
            }
        }
            return Arrays.copyOf(rsl, size);
    }
}