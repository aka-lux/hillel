package com.zakharchenko.homeworks.homework_04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeValidator {
    public static void main(String[] args) {
        System.out.println(codeValidator("AX6BYU56UX6CV6BNT7NM287430"));
        System.out.println(codeValidator("AX9B7UZ4UX6CV6BNT7NM298955"));
        System.out.println(codeValidator("AX9B7UZ4UX6CV6BNT7NM298954"));
    }

    /**
     * This function validate code
     * <p>
     * 1st part can contain only capital letters and 6 digits. 2nd
     * part is all digits and = the product of the first 6 digits
     * taken in groups of two from the left. Eg 65*66*67 =
     * 287430
     *
     * @param code string code
     * @return code is valid or not
     */
    private static Boolean codeValidator(String code) {
        String numbersFromCode = code.replaceAll("\\D", "");

        int firstNumber = Integer.parseInt(numbersFromCode.substring(0, 2));
        int secondNumber = Integer.parseInt(numbersFromCode.substring(2, 4));
        int thirdNumber = Integer.parseInt(numbersFromCode.substring(4, 6));
        int otherDigits = Integer.parseInt(numbersFromCode.substring(6));

        return (firstNumber * secondNumber * thirdNumber) == otherDigits;
    }
}
