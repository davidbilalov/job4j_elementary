package ru.job4j.loop;

public class CheckNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

        return prime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
