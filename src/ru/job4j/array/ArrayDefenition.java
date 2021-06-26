package ru.job4j.array;

public class ArrayDefenition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[4];
        float[] prices = new float[40];
        surname[0] = "0";
        surname[1] = "1";
        surname[2] = "2";
        surname[3] = "3";
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surname.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
