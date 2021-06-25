package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean rsl = left > right;
        return rsl ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
}
