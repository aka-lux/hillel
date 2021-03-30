package com.zakharchenko.homeworks.homework_03;


public class LitresCalculator {
    public static void main(String[] args) {
        System.out.println(litresCalculator(3));
        System.out.println(litresCalculator(6.7));
        System.out.println(litresCalculator(11.8));
    }

    /**
     * LitresCalculator receives the time in hours and returns
     * the number of litres Nathan will drink, rounded to the
     * smallest value.
     *
     * @param hours number of hours
     * @return number of litres
     */
    private static int litresCalculator(double hours) {
        return (int) (hours * 0.5);
    }

}
