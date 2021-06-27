package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
                for (int i = 0; i < array.length; i++) {
                    if (min >= array[i] && i >= start && i <= finish) {
                        min = array[i];
                    }
               }
        return min;
    }
}
