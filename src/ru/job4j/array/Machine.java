package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        money -= price;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while (money >= coins[i]) {
                money -= coins[i];
                rsl[count] = coins[i];
                count++;
            }

        }
        return Arrays.copyOf(rsl, count);
    }

    public static void main(String[] args) {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
