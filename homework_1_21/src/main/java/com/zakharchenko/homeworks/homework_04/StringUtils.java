package com.zakharchenko.homeworks.homework_04;


import java.util.Random;
import java.util.StringTokenizer;


public class StringUtils {
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println(randomString("alpha", 30));
        System.out.println(randomString("lalala", 1));
        System.out.println(randomString("numeric", 30));
        System.out.println(randomString(null, 1));
        System.out.println(randomString("alphanumeric", 30));
        System.out.println(randomString("alphanumeric", 0));

    }

    /**
     * Method would return new string of given length and
     * containing random symbols of given type.
     *
     * @param type   Types: alpha (only letters), numeric (only numbers),
     *               alphanumeric ([a...z & 0..9]
     * @param length length of returned string
     * @return returned random string or empty string
     */
    private static String randomString(String type, int length) {
        if (type == null || type.equals("") || length == 0) {
            return "";
        }
        if ((!type.equals("numeric")) && (!type.equals("alphanumeric")) && (!type.equals("alpha"))) {
            return "";
        }

        String numeric = "0123456789";
        String alphanumeric = "0123456789abcdefghijklmnopqrstuvwxyz";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder(length);
        char randomChar;

        for (int i = 0; i < length; i++) {
            if (type.equals("numeric")) {
                randomChar = numeric.charAt(random.nextInt(numeric.length()));
            } else if (type.equals("alpha")) {
                randomChar = alpha.charAt(random.nextInt(alpha.length()));
            } else {
                randomChar = alphanumeric.charAt(random.nextInt(alphanumeric.length()));
            }
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

}








