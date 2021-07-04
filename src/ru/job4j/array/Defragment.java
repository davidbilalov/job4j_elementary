package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null) {
//                int j = i + 1;
//                while (j < array.length && array[j] == null) {
//                    j++;
//                }
//                if (j < array.length) {
//                    array[i] = array[j];
//                    array[j] = null;
//                }
                int j = i + 1;
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                    }
            }
        }
        return array;
    }

    public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }
}


