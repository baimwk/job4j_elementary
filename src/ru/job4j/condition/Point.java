package ru.job4j.condition;


public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int minusX = x2 - x1;
        int minusY = y2 - y1;
        double powX = Math.pow(minusX, 2);
        double powY = Math.pow(minusY, 2);
        double powXPlusPowY = powX + powY;
        double rsl = Math.sqrt(powXPlusPowY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(0, 1, 0, 5);
        System.out.println("result (0, 1) to (0, 5) " + result);
    }
}
