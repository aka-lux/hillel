package com.zakharchenko.homeworks.utils;

public class Utils {
    public static long greatestCommonDivisor(long a, long b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Number cant be negative");
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
