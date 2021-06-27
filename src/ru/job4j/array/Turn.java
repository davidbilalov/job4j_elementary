package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length  - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
