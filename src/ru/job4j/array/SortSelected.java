package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
