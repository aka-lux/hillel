package com.zakharchenko.homeworks.homework_04;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А в Енисее – синева"));
        System.out.println(isPalindrome("А за работу дадут? – Оба раза!"));
        System.out.println(isPalindrome("А лис, он умен: крыса сыр к нему носила."));
        System.out.println(isPalindrome("авва"));
        System.out.println(isPalindrome("wqfarafqw"));
        System.out.println(isPalindrome("asdf"));
    }

    /**
     * This function checks if a string (array of chars) is a
     * palindrome
     *
     * @param str input string
     * @return boolean value isPalindrome
     */
    private static boolean isPalindrome(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        String alphaRegexp = "[^a-zа-я]";
        char[] strArr;
        strArr = str.toLowerCase().replaceAll(alphaRegexp, "").toCharArray();

        for (int i = 0; i < strArr.length / 2; i++) {
            if (strArr[i] != strArr[strArr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
