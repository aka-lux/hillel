package com.zakharchenko.homeworks.homework_04;

public class StrongNumbers {
    public static void main(String[] args) {
        System.out.println(isStrong(145));
        System.out.println(isStrong(25));
        System.out.println(isStrong(40585));
    }

    /**
     * This function checks if given number is
     * STRONG, i.e. the sum of the factorials of its digits is equal
     * to number itself: 1! + 4! + 5! = 1 + 24 + 120 = 145
     *
     * @param num input number
     * @return return bool value is number strong
     */
    private static boolean isStrong(int num) {
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        int result = 0;
        for (int i : digits ) {
            result += factorial(Integer.parseInt(String.valueOf(digits[i])));
        }
        return result == num;
    }

    /**
     * This function calculate factorial
     *
     * @param n input number
     * @return factorial of number
     */
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

}
