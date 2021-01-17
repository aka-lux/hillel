package com.zakharchenko.homeworks.homework_04;

import java.util.regex.Pattern;

public class Binarysation {
    public static void main(String[] args) {
        System.out.println(toBinary("0123456789"));
        System.out.println(toBinary("9999901234"));
        System.out.println(toBinary("la_la_la"));
    }

    /**
     * This function replace digits to 1 or 0
     * any digit below 5 with '0'
     * any digit 5 and above with '1'
     *
     * @param str input string
     * @return converted string
     */
    private static String toBinary(String str) {
        String toOneRegexp = "[5-9]";
        String toZeroRegexp = "[0-4]";
        String converted;
        converted = str.replaceAll(toZeroRegexp, "0");
        converted = converted.replaceAll(toOneRegexp, "1");
        return converted;
    }
}
