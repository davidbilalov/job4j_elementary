package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el && i >= start && i <= finish) {
                rst = i;
            }
        }
        return rst;
    }
}
