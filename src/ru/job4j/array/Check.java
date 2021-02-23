package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
        for (boolean datum : data) {
            if (datum != temp) {
                result = false;
                break;
            }
        }
        return result;
    }
}
