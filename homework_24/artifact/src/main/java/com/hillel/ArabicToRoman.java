package com.hillel;

public class ArabicToRoman {

    public String convert(int arabic) {
        String[] romanDigits = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        Integer[] arabicDigits = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int index = romanDigits.length - 1;
        StringBuffer sb = new StringBuffer();
        int temp = arabic;

        while (temp > 0) {
            if (temp >= arabicDigits[index]) {
                temp -= arabicDigits[index];
                sb.append(romanDigits[index]);
            } else {
                index--;
            }
        }
        return sb.toString();
    }

}
