package com.zakharchenko.homeworks.homework_02;

public class task_03 {
    public static void main(String[] args) {
        double a = 1;
        double b = -1;
        double c = -2;

        double D = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        double x = (-b / (2 * a));

        System.out.println("Input: a=" + a + ", b=" + b + ", c=" + c);

        if (D > 0) {
            if (x1 < x2) {
                System.out.println("Output: x1=" + x1 + " x2=" + x2);
            } else {
                System.out.println("Output: x1=" + x2 + " x2=" + x1);
            }
        } else if (0 == D) {
            System.out.println("Output: x=" + x);
        } else if (D < 0) {
            System.out.println("Output: no roots");
        }

    }
}
