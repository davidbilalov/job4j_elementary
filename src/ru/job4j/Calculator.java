package ru.job4j;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        int six = 6, four = 4, five = 5;
        int sixDivTwo = six / two, fiveMinusTwo = five - two, fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
/*
2. Создайте еще три переменные для хранения результата арифметических операций.
  - переменную типа int c именем sixDivTwo и присвойте ей значение арифметической операции деления переменной six на two.
  - переменную типа int c именем fiveMinusTwo и присвойте ей значение арифметической операции вычитания переменной five c two.
  - переменную типа int c именем fourTimeTwo и присвойте ей значение арифметической операции умножения переменной four на two.

3. Выведите на консоль переменные sixDivTwo, fiveMinusTwo, fourTimeTwo.
 */