package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                /* условие проверки, что писать пробел или X */
                /* Выше в задании мы определили закономерность, когда нужно проста,влять X */
                if ((j - i) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(7, 7);
        System.out.println();
    }
}
