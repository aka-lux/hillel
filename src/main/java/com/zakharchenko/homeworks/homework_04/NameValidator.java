package com.zakharchenko.homeworks.homework_04;

import java.util.regex.Pattern;

public class NameValidator {
    public static void main(String[] args) {
        System.out.println(isValidName("alex"));
        System.out.println(isValidName("@lux123&"));
        System.out.println(isValidName("la_la_la"));
    }

    /**
     * This function validate user name
     * Allowed characters are:
     * lowercase letters, numbers,  underscore
     *
     * @param name username for validation
     * @return is name valid
     */
    private static Boolean isValidName(String name) {
        String nameRegex = "^[_a-z0-9]+$";
        return Pattern.matches(nameRegex, name);
    }
}
