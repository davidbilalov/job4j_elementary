package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean rsl = left > right;
        int max = rsl ? left : right;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}
