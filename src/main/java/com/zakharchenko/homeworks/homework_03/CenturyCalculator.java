package com.zakharchenko.homeworks.homework_03;

public class CenturyCalculator {
    public static void main(String[] args) {
        System.out.println(centuryCalculator(1705));
        System.out.println(centuryCalculator(1900));
        System.out.println(centuryCalculator(1601));
        System.out.println(centuryCalculator(2000));
    }

    /**
     * CenturyCalculator given a year, return the century
     *
     * @param year year number
     * @return century number
     */
    private static int centuryCalculator(int year) {
        int century = year / 100;
        if ((year % 100) != 0) {
            century++;
        }
        return century;
    }

}
