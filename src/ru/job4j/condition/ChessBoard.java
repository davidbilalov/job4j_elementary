package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (x1 <= 7 && x1 >= 0 && x2 <= 7 && x2 >= 0 && y2 <= 7 && y2 >= 0 && y1 <= 7 && y1 >= 0) {
            return Math.abs(x1 - x2) == Math.abs(y1 - y2) ? Math.abs(y1 - y2) : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(way(6, 7, 1, 2));
    }
}
