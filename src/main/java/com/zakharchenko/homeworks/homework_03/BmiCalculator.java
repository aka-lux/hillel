package com.zakharchenko.homeworks.homework_03;

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.println(bmiCalculator(40, 1.80));
        System.out.println(bmiCalculator(70, 1.80));
        System.out.println(bmiCalculator(90, 1.80));
        System.out.println(bmiCalculator(150, 1.80));
    }

    /**
     * This function that calculates body mass index (bmi
     * = weight / height ^ 2)
     *
     * @param weight human weight in kg
     * @param height human height in m
     * @return String with bmi type
     */
    private static String bmiCalculator(double weight, double height) {
        double bmi = weight / (height * height);

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25) {
            return "Normal";
        } else if (bmi <= 30) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        } else {
            return "failed to calculate";
        }

    }

}
