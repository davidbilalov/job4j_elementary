package ru.job4j.loop;

public class Mortage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount += ((amount / 100) * percent);
        while (salary < amount) {
            salary += salary;
            year++;
        }
        return year;
    }
}
